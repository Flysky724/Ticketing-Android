package com.mohkhz.flysky_agent.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.InfoBottomSheetContent
import com.mohkhz.flysky_agent.ui.theme.*
import com.mohkhz.flysky_agent_support.util.UiEvent
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
    val loginResult = viewModel.loginResult.collectAsState(initial = null).value

    val bottomSheetScaffoldState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        ModalBottomSheetLayout(
            sheetContent = {
                InfoBottomSheetContent({
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
            Scaffold() {
                it.calculateBottomPadding()
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
                                painterResource(id = R.drawable.ic_question),
                                contentDescription = "",
                                Modifier.size(27.dp),
                                tint = Color.Unspecified
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
                        shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp),
                        elevation = 10.dp
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
                                "09371385303",
                                { viewModel.onEvent(LoginEvent.OnNumberChangeVal(it)) },
                                viewModel.number
                            )

                            if (loginResult == false)
                                Error(
                                    ".اطلاعات وارد شده صحیح نمی باشد",
                                    true,
                                    modifier = Modifier
                                        .align(Alignment.End)
                                        .padding(end = 46.dp)
                                )
                            else if (emptyFieldError)
                                Error(
                                    "آدرس سایت و شماره تماس را وارد کنید",
                                    false,
                                    modifier = Modifier
                                        .align(Alignment.End)
                                        .padding(end = 46.dp)
                                )
                            else
                                Row(
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Text(
                                        text = "",
                                        fontFamily = kalameh_semi_bold,
                                        fontSize = 15.sp,
                                    )

                                    Spacer(modifier = Modifier.size(5.dp))

                                }

                            CustomButton(
                                modifier = Modifier
                                    .width(280.dp)
                                    .padding(top = 10.dp),
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

}

@Composable
fun Error(text: String, isError: Boolean, modifier: Modifier) {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier

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
                Text(text = "$title", fontFamily = kalameh_regular, fontSize = 14.sp)
            },
            placeholder = {
                Text(text = "$placeholder", fontFamily = kalameh_regular, fontSize = 15.sp)
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
            ),
            maxLines = 1,
            singleLine = true,
            textStyle = TextStyle(fontSize = 16.sp, fontFamily = kalameh_regular),
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
    inProgress: Boolean = false,
    contentPadding: PaddingValues = PaddingValues(5.dp)
) {

    OutlinedButton(
        modifier = modifier,
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = primary,
            contentColor = Color.White,
        ),
        shape = roundedCornerShape,
        contentPadding = contentPadding
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