package com.mohkhz.flysky_agent.ui.NewAgent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.InfoBottomSheetContent
import com.mohkhz.flysky_agent.ui.theme.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NewAgentScreen(
    viewModel: NewAgentViewModel = hiltViewModel(),
    onBack: () -> Unit
) {

    val emptyField = viewModel.emptyError.collectAsState(initial = false).value

    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    ModalBottomSheetLayout(
        sheetContent = {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
                InfoBottomSheetContent {
                    scope.launch(Dispatchers.Main) {
                        if (bottomSheetState.isVisible) {
                            bottomSheetState.hide()
                        } else
                            bottomSheetState.show()
                    }
                }
            }
        },
        sheetState = bottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp),
        sheetBackgroundColor = Color.White,
        sheetElevation = 20.dp,
    ) {
        androidx.compose.material.Scaffold(
            topBar = {
                AppBar(backClick = { onBack() }, onInfoClick = {
                    scope.launch(Dispatchers.Main) {
                        bottomSheetState.show()
                    }
                })
            },
            modifier = Modifier.padding(0.dp)
        ) {
            it.calculateBottomPadding()
            it.calculateTopPadding()

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 60.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_profile_add),
                    contentDescription = "",
                    modifier = Modifier
                        .size(190.dp)
                        .padding(top = 28.dp, bottom = 5.dp),
                )

                CustomTextField(
                    title = "نام",
                    placeholder = "محمدمهدی",
                    onValueChange = { viewModel.onEvent(NewAgentEvent.OnFistNameValueChange(it)) },
                    value = viewModel.firstName,
                    color = Color(0xff00A7FF),
                    modifier = Modifier.fillMaxWidth()
                )

                CustomTextField(
                    title = "نام‌خانوادگی",
                    placeholder = "خواجه زاده",
                    onValueChange = { viewModel.onEvent(NewAgentEvent.OnLastNameValueChange(it)) },
                    value = "${viewModel.lastName}",
                    color = Color(0xffFF8900),
                    modifier = Modifier.fillMaxWidth()
                )

                CustomTextField(
                    title = "شماره تلفن همراه",
                    placeholder = "09388209270",
                    onValueChange = { viewModel.onEvent(NewAgentEvent.OnPhoneValueChange(it)) },
                    value = "${viewModel.phone}",
                    color = Color(0xffFFD900),
                    modifier = Modifier.fillMaxWidth()
                )

                CustomTextField(
                    title = "آدرس سایت",
                    placeholder = "www.flysky724.ir",
                    onValueChange = { viewModel.onEvent(NewAgentEvent.OnWebsiteValueChange(it)) },
                    value = "${viewModel.website}",
                    color = Color(0xff5DCC32),
                    modifier = Modifier.fillMaxWidth()
                )

                if (emptyField)
                    Error(
                        text = "تمامی فیلد ها را تکمیل کنید.",
                        isError = true,
                        modifier = Modifier.align(Alignment.Start)
                    )
                else
                    Error(
                        text = "",
                        isError = false,
                        modifier = Modifier.align(Alignment.Start)
                    )

                CustomButton(
                    onClick = { viewModel.onEvent(NewAgentEvent.OnAddClick({ onBack() })) },
                    text = "اضافه کردن",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                )

            }

        }
    }


}

@Composable
fun AppBar(
    backClick: () -> Unit,
    onInfoClick: () -> Unit
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "نماینده جدید",
                    color = Color.White,
                    fontFamily = kalameh_bold,
                    textAlign = TextAlign.Center,
                    fontSize = 21.sp
                )
            },
            actions = {
                IconButton(onClick = { onInfoClick() }) {
                    Icon(
                        painterResource(id = R.drawable.ic_question),
                        contentDescription = "",
                        modifier = Modifier
                            .size(44.dp),
                        tint = Color.Unspecified,
                    )
                }
            },
            navigationIcon = {
                IconButton(
                    onClick = { backClick() },
                    modifier = Modifier
                        .padding(start = 3.dp)
                ) {
                    Icon(
                        painterResource(id = R.drawable.ic_back_arrow),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .size(20.dp)
                    )
                }
            },
            modifier = Modifier
                .clip(RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
                .height(64.dp)
                .shadow(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(bottomEnd = 11.dp, bottomStart = 11.dp),
                    clip = false,
                )
                .wrapContentSize(Alignment.Center)
                .background(Color(0xffF3F5FA)),
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = primary
            ),
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
    color: Color,
    modifier: Modifier = Modifier
) {

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
                focusedBorderColor = color,
                unfocusedBorderColor = color,
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
            enabled = true,
            modifier = modifier,
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

@Composable
fun Error(text: String, isError: Boolean, modifier: Modifier) {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        val color = if (isError) secondColor else type

        if (isError)
            Icon(
                painterResource(id = R.drawable.error),
                contentDescription = "",
                Modifier.size(18.dp),
                tint = color
            )

        Spacer(modifier = Modifier.size(5.dp))

        Text(
            text = text,
            fontFamily = kalameh_semi_bold,
            fontSize = 15.sp,
            color = color,
        )

    }
}