package com.mohkhz.flysky_agent.ui.Home

import android.app.Activity
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.LocalOverScrollConfiguration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.InfoBottomSheetContent
import com.mohkhz.flysky_agent.ui.login.CustomButton
import com.mohkhz.flysky_agent.ui.theme.*
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.UiEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private const val TAG = "HomeScreen"

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    onNavigate: (UiEvent.Navigate) -> Unit,
) {

    val ticketList = viewModel.ticketList.collectAsState(initial = emptyList()).value
    val inProgress = viewModel.inProgress.collectAsState(initial = false).value
    val newTicket = viewModel.newTicket.collectAsState(initial = false).value
    val priorityCat = viewModel.priorityCat.collectAsState(initial = emptyList()).value
    val category = viewModel.category.collectAsState(initial = emptyList()).value

    val isRefreshing by viewModel.isRefreshing.collectAsState(initial = false)

    val priorityExpended = viewModel.priorityExpended.collectAsState().value
    val ticketExpended = viewModel.ticketExpended.collectAsState().value
    val ticketStatusExpended = viewModel.ticketStatusExpended.collectAsState().value

    val priorityValue = viewModel.priorityValue.collectAsState().value
    val ticketStatusValue = viewModel.ticketStatusValue.collectAsState().value
    val ticketValue = viewModel.ticketValue.collectAsState().value

    val subjectValue = viewModel.subject.collectAsState().value
    val textValue = viewModel.textValue.collectAsState().value
    val user = viewModel.user.collectAsState(User()).value


    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    LaunchedEffect(key1 = true) {
        viewModel.setUser()
        if (user.id != null)
            viewModel.getTickets()

        viewModel.uiEvent.collect {
            when (it) {
                is UiEvent.Navigate -> {
                    onNavigate(it)
                }
                else -> Unit
            }
        }
    }

    var backPressed by remember { // save the number of back press
        mutableStateOf(0)
    }

    // get the activity
    val activity = (LocalContext.current as? Activity)


    // handle the back btn => press twice to exit
    BackHandler(true) {
        if (backPressed > 1)
            activity?.finish()
        else {
            Toast.makeText(activity!!.applicationContext, "Press back again", Toast.LENGTH_SHORT)
                .show()
            backPressed++
        }

    }

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        ModalBottomSheetLayout(
            sheetContent = {
                InfoBottomSheetContent({
                    scope.launch(Dispatchers.Main) {
                        if (bottomSheetState.isVisible) {
                            bottomSheetState.hide()
                        } else
                            bottomSheetState.show()
                    }
                })
            },
            sheetState = bottomSheetState,
            sheetShape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp),
            sheetBackgroundColor = Color.White,
            sheetElevation = 20.dp,
        ) {
            Scaffold(
                topBar = {
                    AppBar(profileClick = { viewModel.onEvent(HomeEvent.OnProfileClick) },
                        notificationClick = { viewModel.onEvent(HomeEvent.OnNotification) },
                        questionClick = {
                            scope.launch(Dispatchers.Main) {
                                bottomSheetState.show()
                            }
                        })
                },
                floatingActionButton = { FloatingButton({ viewModel.onEvent(HomeEvent.OnNewTicketClick) }) },
                backgroundColor = homeBackground,
            ) {
                it.calculateBottomPadding()

                if (inProgress) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        CircularProgressIndicator(
                            modifier = Modifier
                                .size(30.dp),
                            strokeWidth = 4.dp
                        )

                        Text(
                            text = "...در حال دریافت اطلاعات",
                            fontSize = 15.sp,
                            fontFamily = kalameh_semi_bold,
                            textAlign = TextAlign.Justify,
                            modifier = Modifier.padding(8.dp)
                        )

                    }
                } else if (!inProgress && ticketList.isEmpty()) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "تیکتی یافت نشد", fontSize = 16.sp,
                            fontFamily = kalameh_semi_bold,
                            textAlign = TextAlign.Justify,
                        )

                        Text(
                            text = "برای ایجاد تیکت جدید روی + کلیک کنید", fontSize = 13.sp,
                            fontFamily = kalameh_semi_bold,
                            textAlign = TextAlign.Justify,
                            modifier = Modifier.padding(8.dp),
                            color = Color(0xFF9B9B9B)
                        )
                    }
                } else {
                    Column(
                        modifier = Modifier.padding(horizontal = 20.dp),
                    ) {

                        LazyList(
                            list = ticketList,
                            { viewModel.onEvent(HomeEvent.OnTicketClick(it)) },
                            onRefresh = { viewModel.onEvent(HomeEvent.OnRefresh) },
                            isRefreshing = isRefreshing
                        )

                    }
                }

            }

            if (newTicket)
                DialogUi(
                    priorityCat,
                    categoryList = category,
                    viewModel,
                    priorityExpended = priorityExpended,
                    ticketExpended = ticketExpended,
                    priorityValue = priorityValue,
                    ticketValue = ticketValue,
                    subjectValue = subjectValue
                )
        }
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyList(
    list: List<Ticket>,
    onClick: (String) -> Unit,
    onRefresh: () -> Unit,
    isRefreshing: Boolean
) {
    CompositionLocalProvider(
        LocalOverScrollConfiguration provides null
    ) {
        SwipeRefresh(
            state = rememberSwipeRefreshState(isRefreshing),
            onRefresh = { onRefresh() },
        ) {
            LazyColumn(
                modifier = Modifier.wrapContentSize(),
                verticalArrangement = Arrangement.spacedBy(5.dp),
            ) {
                itemsIndexed(list) { index, item ->
                    TicketItem(ticket = item, { onClick(it) })
                }
            }
        }

    }


}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun BottomSheet(onClick: () -> Unit) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color.White
        ) {
            Column(
                modifier = Modifier
                    .padding(vertical = 20.dp, horizontal = 30.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(30.dp)
            ) {

                Icon(
                    Icons.Default.Notifications,
                    contentDescription = "",
                    tint = primary,
                    modifier = Modifier.size(48.dp)
                )

                Text(
                    text = "برنامه پشتیبانی نمایندگان \n فلای اسکای ۷۲۴",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = kalameh_bold,
                    modifier = Modifier.padding(top = 25.dp),
                )

                Text(
                    text = ".این سیستم توسط فلای اسکای ۷۲۴ طراحی شده است" + "\n" + ".درصورت هر گونه مشکل با پشتیبانی ۲۴ ساعت تماس بگیرید",
                    fontSize = 17.sp,
                    fontFamily = kalameh_regular,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 15.dp),
                    letterSpacing = TextUnit(.1f, TextUnitType.Sp),
                    lineHeight = 20.sp
                )

                Card(
                    shape = RoundedCornerShape(16.dp),
                    backgroundColor = secondColor,
                    modifier = Modifier.padding(top = 22.dp),
                ) {
                    Row(modifier = Modifier.padding(vertical = 7.dp, horizontal = 15.dp)) {
                        Icon(Icons.Default.Phone, contentDescription = "", tint = Color.White)
                        Text(
                            modifier = Modifier.padding(start = 2.dp),
                            text = "+98 937 138 5303",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }

                CustomButton(
                    onClick = { onClick() },
                    text = "متوجه شدم",
                    roundedCornerShape = RoundedCornerShape(16.dp),
                    fontSize = 15.dp,
                    modifier = Modifier
                        .padding(25.dp)
                        .width(264.dp)
                )

            }

        }
    }
}

@Composable
fun AppBar(
    profileClick: () -> Unit,
    notificationClick: () -> Unit,
    questionClick: () -> Unit
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "پیام ها",
                color = primary,
                fontFamily = kalameh_bold,
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        },
        actions = {

            IconButton(onClick = { profileClick() }) {
                Icon(
                    painterResource(id = R.drawable.ic_profile),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(32.dp)
                )
            }

        },
        navigationIcon = {
            IconButton(onClick = { questionClick() }) {
                Icon(
                    painterResource(id = R.drawable.ic_question),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(32.dp)
                )
            }
        },
        modifier = Modifier
            .clip(RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
            .height(66.dp)
            .wrapContentSize(
                Alignment.Center
            )
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp),
                clip = true,
            ),
    )
}

@Composable
fun FloatingButton(onClick: () -> Unit) {

    FloatingActionButton(
        onClick = { onClick() },
        modifier = Modifier
            .padding(16.dp)
            .size(60.dp)
            .clip(RoundedCornerShape(18.dp)),
        backgroundColor = primary,
        shape = RectangleShape,
        elevation = FloatingActionButtonDefaults.elevation()
    ) {
        Icon(
            painterResource(id = R.drawable.ic_add),
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier
                .size(28.dp)
        )
    }

}

@Composable
fun TicketItem(ticket: Ticket, onClick: (String) -> Unit) {

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .clickable { onClick(ticket.id!!) },
            elevation = 5.dp,
            shape = RoundedCornerShape(10.dp)
        ) {

            Column(
                modifier = Modifier.padding(
                    top = 5.dp,
                    bottom = 15.dp,
                    end = 25.dp,
                    start = 25.dp
                )
            ) {

                Text(
                    text = "${ticket.title}",
                    fontSize = 18.sp,
                    fontFamily = kalameh_bold,
                    modifier = Modifier.padding(top = 10.dp)
                )

                Text(
                    text = "${ticket.lastMessage}",
                    modifier = Modifier.padding(top = 3.dp),
                    fontSize = 15.sp,
                    color = Color(0xffAFAFAF),
                    fontFamily = kalameh_regular,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Row(
                    modifier = Modifier
                        .padding(top = 13.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    StatusCard(
                        modifier = Modifier
                            .width(105.dp)
                            .height(22.dp)
                            .fillMaxSize(),
                        ticketStatus = ticket.status!!
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {

                        TagItem(ticket.category, false)

                        TagItem(ticket.priority, true)

                    }
                }
            }
        }
    }

}

@Composable
fun StatusCard(modifier: Modifier, ticketStatus: String) {

    val color = if (ticketStatus.equals("در حال بررسی")) inProgress else closed

    Card(
        modifier = modifier,
        backgroundColor = color
    ) {
        Text(
            modifier = Modifier,
            text = "$ticketStatus",
            color = Color.White,
            fontFamily = kalameh_semi_bold,
            fontSize = 11.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W600
        )
    }

}

@Composable
fun TagItem(text: String?, isPriority: Boolean) {

    val color = if (isPriority) Color(0x4DDF1356) else Color(0xFFD4BFF5)

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Card(
            border = BorderStroke(width = 1.dp, color),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(3.dp),
            elevation = 0.dp
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(3.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 2.dp, horizontal = 6.dp)
            ) {

                Icon(
                    painterResource(id = R.drawable.ic_circle),
                    contentDescription = "",
                    tint = color,
                    modifier = Modifier.size(9.dp)
                )

                Text(
                    text = "$text",
                    fontSize = 9.sp,
                    fontFamily = kalameh_semi_bold,
                    color = Color(0xBF707070)
                )

            }
        }
    }

}

