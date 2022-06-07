package com.mohkhz.flysky_agent.ui.Ticket

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.LocalOverScrollConfiguration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.Progress
import com.mohkhz.flysky_agent.ui.theme.*
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.UiEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TicketScreen(
    viewModel: TicketViewModel = hiltViewModel(),
    onNavigate: (UiEvent.Navigate) -> Unit,
    onBack: () -> Unit
) {
    val messageList = viewModel.messageList.collectAsState(initial = emptyList()).value
    val inProgress = viewModel.inProgress.collectAsState(initial = false).value
    val user = viewModel.user.collectAsState(initial = User()).value
    val otherUser = viewModel.otherUser.collectAsState(initial = User()).value
    val ticket = viewModel.ticket.collectAsState(initial = Ticket()).value

    val listState = rememberLazyListState()

    Scaffold(
        topBar = { AppBar(backClick = { onBack() }, user = otherUser) },
        backgroundColor = Color(0xffF3F5FA)
    ) {

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxSize()
        ) {

            if (inProgress) {
                Progress()
            } else {
                CompositionLocalProvider(
                    LocalOverScrollConfiguration provides null
                ) {
                    LazyColumn(
                        state = listState,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(.7f),
                    ) {
                        itemsIndexed(viewModel.listTest) { index, item ->
                            if (user.id!! == item.uId) {
                                OwnerMessage(
                                    text = item.text,
                                    item.sendProgress,
                                    time = viewModel.calculateTime(item.date)
                                )
                            } else {
                                ReceivedMessage(
                                    text = item.text,
                                    time = viewModel.calculateTime(item.date)
                                )
                            }
                        }

                        CoroutineScope(Dispatchers.Main).launch {
                            listState.scrollToItem(index = messageList.size)
                        }

                    }
                }

            }

            if (ticket.status == "در حال بررسی") {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(end = 5.dp, bottom = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    IconButton(
                        onClick = { viewModel.onEvent(TicketEvent.OnSendClick) },
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .weight(0.15f)
                            .padding(start = 5.dp, top = 3.dp),
                        enabled = viewModel.text.isNotEmpty() && ticket.status == "در حال بررسی"
                    ) {
                        Icon(
                            painterResource(id = R.drawable.ic_send),
                            contentDescription = "",
                            tint = Color.Unspecified
                        )
                    }

                    BasicTextField(
                        value = viewModel.text,
                        onValueChange = { viewModel.onEvent(TicketEvent.OnTextChange(it)) },
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
                            .shadow(
                                clip = false,
                                elevation = 2.dp,
                                shape = RoundedCornerShape(13.dp)
                            )
                            .weight(0.85f),
                        maxLines = 4,
                        onTextLayout = { },
                        decorationBox = { innerTextField ->
                            Row(
                                Modifier
                                    .background(Color.White, RoundedCornerShape(13.dp))
                                    .padding(11.dp)
                            ) {
                                if (viewModel.text.isEmpty())
                                    Text(
                                        text = "پیام شما",
                                        color = Color(0xFF8F8F8F),
                                        fontSize = 15.sp,
                                        fontFamily = kalameh_semi_bold,
                                        fontWeight = FontWeight.W600
                                    )
                                else
                                    innerTextField()
                            }
                        },
                        textStyle = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.W600,
                            fontFamily = kalameh_semi_bold
                        ),
                        enabled = ticket.status == "در حال بررسی"
                    )
                }
            } else {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(
                            Color(0xFFC5C5C5)
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "این تیکت توسط مدیریت بسته شده است",
                        textAlign = TextAlign.Center,
                        fontFamily = kalameh_medium,
                        fontSize = 16.sp,
                        color = Color.Black,
                    )
                }

            }


        }

    }

}

@Composable
fun AppBar(
    backClick: () -> Unit,
    user: User
) {
    // color -> 0xffF3F5FA
    CenterAlignedTopAppBar(
        title = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 5.dp)
            ) {
                Text(
                    text = "${user.userName}",
                    color = Color.Black,
                    fontFamily = kalameh_bold,
                    textAlign = TextAlign.Center,
                    fontSize = 17.sp
                )
                Text(
                    text = "${user.category}",
                    color = primary,
                    fontFamily = kalameh_bold,
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp
                )
            }

        },
        actions = {
            Box(
                modifier = Modifier
                    .padding(end = 8.dp)
                    .shadow(elevation = 0.dp, shape = RoundedCornerShape(5.dp))
                    .size(47.dp)
            ) {
                Icon(
                    Icons.Default.Person,
                    contentDescription = "",
                    modifier = Modifier.size(44.dp)
                )
            }
        },
        navigationIcon = {
            IconButton(
                onClick = { backClick() },
                modifier = Modifier
                    .padding(start = 16.dp)
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_back_2),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(47.dp)
                )
            }
        },
        modifier = Modifier
            .clip(RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
            .height(67.dp)
            .wrapContentSize(Alignment.Center)
            .background(Color(0xffF3F5FA))
            .shadow(
                elevation = 3.dp,
                shape = RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp),
                clip = true,
            ),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color(0xffF3F5FA)
        )

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OwnerMessage(text: String, inProgress: Boolean, time: String) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 13.dp, top = 5.dp, bottom = 5.dp)
        ) {
            Card(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp,
                    pressedElevation = 2.dp,
                ),
                modifier = Modifier
                    .align(Alignment.Start)
                    .heightIn(min = 40.dp, max = 200.dp)
                    .widthIn(min = 40.dp, max = 250.dp),
                colors = CardDefaults.cardColors(
                    containerColor = primary
                ),
                shape = RoundedCornerShape(topEnd = 12.dp, topStart = 12.dp, bottomEnd = 12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(
                        top = 4.dp,
                        bottom = 4.dp,
                        start = 8.dp,
                        end = 8.dp
                    )
                ) {

                    Text(
                        text = "$text",
                        fontSize = 12.sp,
                        color = Color.White,
                        fontFamily = kalameh_semi_bold,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier.padding(end = 9.dp)
                    )

                    Row(
                        modifier = Modifier
                            .align(Alignment.End),
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            if (inProgress)
                                painterResource(id = R.drawable.ic_send_progress)
                            else {
                                painterResource(id = R.drawable.ic_send_ok)
                            },
                            "",
                            modifier = Modifier.size(if (inProgress) 10.dp else 13.dp),
                            tint = Color.Unspecified,
                        )

                        Text(
                            text = "$time",
                            fontSize = 10.sp,
                            color = Color.White,
                            fontFamily = kalameh_num_bold,
                            textAlign = TextAlign.End,
                        )

                    }

                }
            }
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReceivedMessage(text: String, time: String) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 13.dp, top = 5.dp, bottom = 5.dp)
        ) {
            Card(
                modifier = Modifier
                    .align(Alignment.End)
                    .heightIn(min = 40.dp, max = 200.dp)
                    .widthIn(min = 50.dp, max = 250.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ), elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp,
                    pressedElevation = 2.dp,

                    ),
                shape = RoundedCornerShape(topEnd = 12.dp, topStart = 12.dp, bottomStart = 12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(
                        top = 4.dp,
                        bottom = 4.dp,
                        start = 8.dp,
                        end = 8.dp
                    )
                ) {

                    Text(
                        text = "$text",
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontFamily = kalameh_semi_bold,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(end = 9.dp)
                    )

                    Row(
                        modifier = Modifier
                            .align(Alignment.End),
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Text(
                            text = "$time",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontFamily = kalameh_num_bold,
                            textAlign = TextAlign.End,

                            )
                    }


                }
            }
        }

    }

}