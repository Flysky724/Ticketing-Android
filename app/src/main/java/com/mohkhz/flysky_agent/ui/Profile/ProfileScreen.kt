package com.mohkhz.flysky_agent.ui.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.Progress
import com.mohkhz.flysky_agent.ui.theme.kalameh_bold
import com.mohkhz.flysky_agent.ui.theme.kalameh_medium
import com.mohkhz.flysky_agent.ui.theme.kalameh_num_bold
import com.mohkhz.flysky_agent.ui.theme.primary
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.UiEvent

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = hiltViewModel(),
    onNavigate: (UiEvent.Navigate) -> Unit,
    onBack: () -> Unit
) {

    val user = viewModel.user.collectAsState(initial = User()).value
    val userName = viewModel.userName.collectAsState(initial = emptyArray()).value
    val inProgress = viewModel.inProgress.collectAsState(initial = true).value

    LaunchedEffect(key1 = true) {
        viewModel.uiEvent.collect {
            when (it) {
                is UiEvent.Navigate -> {
                    onNavigate(it)
                }
                else -> Unit
            }
        }
    }

    val context = LocalContext.current

    Scaffold(
        topBar = {
            AppBar {
                onBack()
            }
        },
        backgroundColor = Color.White
    ) {

        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            if (inProgress) {
                Progress()
            } else {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 15.dp)
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.ic_profile_pic),
                                contentDescription = "",
                                Modifier.size(160.dp)
                            )

                            Spacer(
                                modifier = Modifier
                                    .width(16.dp)
                            )

                            Divider(
                                modifier = Modifier
                                    .height(150.dp)
                                    .width(1.dp)
                                    .padding(top = 25.dp)
                            )

                            Column(
                                verticalArrangement = Arrangement.spacedBy(5.dp),
                                modifier = Modifier.padding(top = 30.dp, start = 30.dp)
                            ) {
                                Text(
                                    text = "${user!!.category}",
                                    fontFamily = kalameh_bold,
                                    fontSize = 18.sp,
                                    color = Color(0xff9599A1)
                                )

                                Text(
                                    text = "${viewModel.setWebsite(user.website!!)}",
                                    fontFamily = kalameh_bold,
                                    fontSize = 19.sp,
                                    color = Color(0xff000000),
                                    maxLines = 1,
                                )

                                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
                                    Text(
                                        text = "${user.phoneNumber}",
                                        fontFamily = kalameh_num_bold,
                                        fontSize = 18.sp,
                                        color = Color(0xff9599A1),
                                        textAlign = TextAlign.Start,
                                    )
                                }

                            }
                        }

                        //name
                        if (userName.size > 1) {
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(
                                        style = SpanStyle(
                                            fontSize = 22.sp,
                                            color = Color(0xff15192B),
                                            fontFamily = kalameh_bold,
                                        )
                                    ) {
                                        append("${userName[0]}\n")
                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            fontSize = 22.sp,
                                            color = Color(0xff9599A1),
                                            fontFamily = kalameh_medium,
                                        )
                                    ) {
                                        append("${userName[1]}")
                                    }
                                },
                                modifier = Modifier.padding(start = 33.dp),
                            )
                        }

                        Column(
                            verticalArrangement = Arrangement.spacedBy(25.dp),
                            modifier = Modifier.padding(top = 40.dp)
                        ) {
                            ListItem(
                                title = "پشتیبانی واتساپ",
                                icon = painterResource(id = R.drawable.ic_phone),
                                onClick = { viewModel.onEvent(ProfileEvent.OnWhatsAppClick(context)) })

                            ListItem(
                                title = "ورود به سایت",
                                icon = painterResource(id = R.drawable.ic_enter),
                                onClick = { viewModel.onEvent(ProfileEvent.OnEnterSiteClick(context)) })

                            if (user.id == 1)
                                ListItem(
                                    title = "نماینده جدید",
                                    icon = painterResource(id = R.drawable.ic_add_profile),
                                    onClick = { viewModel.onEvent(ProfileEvent.OnNewAgentClick) },
                                    enable = user.id == 1
                                )
                        }
                    }

                    Button(
                        onClick = {
                            viewModel.onEvent(ProfileEvent.OnLogOutClick)
                        },
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(bottom = 35.dp, start = 22.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xffF5F5F7),
                        ),
                        shape = RoundedCornerShape(10.dp),
                        contentPadding = PaddingValues(
                            top = 5.dp,
                            bottom = 5.dp,
                            end = 13.dp,
                            start = 13.dp
                        )
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(19.dp)
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.ic_logout),
                                contentDescription = "",
                                tint = Color.Unspecified
                            )

                            Text(
                                text = "خروج", fontSize = 18.sp,
                                color = Color(0xFF161616),
                                fontFamily = kalameh_bold,
                            )

                        }
                    }

                }
            }
        }

    }

}

@Composable
fun AppBar(
    onBack: () -> Unit
) {

    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "پروفایل کاربری",
                color = primary,
                fontFamily = kalameh_bold,
                textAlign = TextAlign.Center,
                fontSize = 23.sp,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 5.dp),
            )
        },
        navigationIcon = {
            IconButton(
                onClick = { onBack() },
                modifier = Modifier.padding(top = 5.dp, start = 5.dp)
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_back_2),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier
                )
            }
        },
        modifier = Modifier
            .clip(RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
            .height(65.dp),
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.White
        )
    )
}

@Composable
fun ListItem(
    title: String,
    icon: Painter = painterResource(id = R.drawable.ic_phone),
    onClick: () -> Unit,
    enable: Boolean = true
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    painter = icon,
                    contentDescription = "",
                    Modifier.size(45.dp),
                    tint = Color.Unspecified
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 26.dp),
                ) {
                    Text(
                        text = "$title",
                        fontFamily = kalameh_bold,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W700,
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_next),
                        contentDescription = "",
                        Modifier
                            .size(45.dp)
                            .shadow(elevation = 5.dp, shape = RoundedCornerShape(8.dp))
                            .clickable(enabled = enable) { onClick() },
                        tint = Color.Unspecified,
                    )
                }

            }
        }
    }

}


















