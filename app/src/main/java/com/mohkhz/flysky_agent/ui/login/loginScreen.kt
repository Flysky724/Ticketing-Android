package com.mohkhz.flysky_agent.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.theme.*
import com.mohkhz.flysky_agent_support.util.UiEvent
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel(),
    onNavigate: (UiEvent.Navigate) -> Unit,
) {

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

    val infoVisibility = viewModel.infoDialog.collectAsState().value
    val emptyFieldError = viewModel.emptyFieldError.collectAsState().value
    val loginProgress = viewModel.loginProgress.collectAsState(initial = true).value

    val bottomSheetScaffoldState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    ModalBottomSheetLayout(
        sheetContent = {
            BottomSheetContent({
                scope.launch {
                    bottomSheetScaffoldState.hide()
                }
            })
        },
        sheetState = bottomSheetScaffoldState,
        sheetShape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp),
        sheetBackgroundColor = Color.White,
        sheetElevation = 20.dp,
    ) {
        Scaffold(
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(primary),
                horizontalAlignment = Alignment.End
            ) {
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .align(Alignment.Start),
                    shape = RoundedCornerShape(bottomEnd = 70.dp),
                    backgroundColor = Color.White
                ) {
                    IconButton(
                        onClick = {
                            viewModel.onEvent(LoginEvent.OnInfoClick)
                            scope.launch {
                                if (bottomSheetScaffoldState.isVisible) {
                                    bottomSheetScaffoldState.hide()
                                } else {
                                    bottomSheetScaffoldState.show()
                                }
                            }

                        },
                        modifier = Modifier
                            .align(alignment = Alignment.Start)
                            .padding(end = 10.dp, bottom = 5.dp)

                    ) {
                        Icon(
                            painterResource(id = R.drawable.error),
                            contentDescription = "",
                            Modifier.size(25.dp),
                            tint = primary
                        )
                    }
                }

                Text(
                    text = "!خوش آمدین",
                    fontFamily = kalameh_bold,
                    color = Color.White,
                    fontSize = 35.sp,
                    modifier = Modifier.padding(end = 60.dp, top = 30.dp)
                )

                Card(
                    modifier = Modifier
                        .padding(top = 100.dp)
                        .fillMaxSize(),
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp), elevation = 10.dp
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier
                            .padding(10.dp),
                    ) {

                        Spacer(modifier = Modifier.height(35.dp))

                        CustomTextField(
                            "آدرس سایت",
                            emptyFieldError,
                            "www.flysky724.ir",
                            { viewModel.onEvent(LoginEvent.OnWebSiteChangeVal(it)) },
                            viewModel.webSite
                        )

                        CustomTextField(
                            "شماره تماس",
                            emptyFieldError,
                            "شماره تماس",
                            { viewModel.onEvent(LoginEvent.OnNumberChangeVal(it)) },
                            viewModel.number
                        )

                        if (emptyFieldError)
                            Error(".لطفا آدرس سایت و شماره تلفن همراه خود را وارد کنید", true)
                        else
                            Error("آدرس سایت و شماره تماس را وارد کنید", false)

                        CustomButton(
                            modifier = Modifier
                                .width(280.dp)
                                .padding(top = 23.dp),
                            onClick = { viewModel.onEvent(LoginEvent.OnLoginClick) },
                            text = "تایید",
                            inProgress = loginProgress
                        )

                    }
                }
            }

        }
    }

}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun BottomSheetContent(doneClose: () -> Unit) {
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
                onClick = { doneClose() },
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

@Composable
fun Error(text: String, isError: Boolean) {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val color = if (isError) secondColor else type
        Text(
            text = text,
            fontFamily = kalameh_semi_bold,
            fontSize = 15.sp,
            color = color,
        )

        Spacer(modifier = Modifier.size(5.dp))

        Icon(
            painterResource(id = R.drawable.error),
            contentDescription = "",
            Modifier.size(18.dp),
            tint = color
        )
    }
}

@Composable
fun CustomTextField(
    title: String = "آدرس سایت",
    isError: Boolean = false,
    placeholder: String,
    onValueChange: (String) -> Unit,
    value: String,
) {
    // TODO: can use the outlineTextField
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        OutlinedTextField(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            label = {
                Text(text = "$title", fontFamily = kalameh_regular)
            },
            placeholder = {
                Text(text = "$placeholder", fontFamily = kalameh_regular)
            },
            isError = isError,
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = primary,
                unfocusedBorderColor = default,
                cursorColor = Color.Black,
                errorBorderColor = secondColor,
                textColor = Color.Black,
                disabledLabelColor = Color(0xff707070),
                placeholderColor = Color(0xff707070),
                unfocusedLabelColor = Color(0xff707070),
            )
        )
    }

}

@Composable
fun CustomButton(
    onClick: () -> Unit,
    text: String,
    fontSize: Dp = 20.dp,
    roundedCornerShape: RoundedCornerShape = RoundedCornerShape(5.dp),
    modifier: Modifier,
    inProgress: Boolean = false
) {

    OutlinedButton(
        modifier = modifier,
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = primary,
            contentColor = Color.White,
        ),
        shape = roundedCornerShape
    ) {
        if (inProgress) {
            CircularProgressIndicator(
                color = Color.White,
                modifier = Modifier
                    .padding(6.dp)
                    .size(23.dp),
                strokeWidth = 2.5.dp
            )
        } else
            Text(text = "$text", fontFamily = kalameh_bold, fontSize = fontSize.value.sp)
    }
}