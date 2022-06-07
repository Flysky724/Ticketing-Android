package com.mohkhz.flysky_agent.ui.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.theme.*
import com.mohkhz.flysky_agent_support.data.model.CategoryItem

@Composable
fun DialogUi(
    priorityCatList: List<CategoryItem.PriorityCat>,
    categoryList: List<CategoryItem.TicketCat>,
    viewModel: HomeViewModel,
    priorityExpended: Boolean,
    ticketExpended: Boolean,
    priorityValue: CategoryItem?,
    ticketValue: CategoryItem?,
    subjectValue: String?,
) {
    Dialog(onDismissRequest = {}) {
        CustomDialogUI(
            modifier = Modifier.padding(start = 15.dp, end = 15.dp),
            { },
            priorityCatList, categoryList,
            viewModel,
            priorityExpended, ticketExpended, priorityValue, ticketValue, subjectValue
        )
    }
}

@Composable
fun CustomDialogUI(
    modifier: Modifier = Modifier,
    openDialog: () -> Unit,
    priorityCatList: List<CategoryItem.PriorityCat>,
    categoryList: List<CategoryItem.TicketCat>,
    viewModel: HomeViewModel,
    priorityExpended: Boolean,
    ticketExpended: Boolean,
    priorityValue: CategoryItem?,
    ticketValue: CategoryItem?,
    subjectValue: String?,
) {

    val a = viewModel.location.collectAsState("start").value // start  //text //end

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = modifier.height(375.dp),
            elevation = 8.dp
        ) {

            if (a.equals("start")) {
                SelectInfo(
                    openDialog = { openDialog() },
                    priorityCatList = priorityCatList,
                    categoryList = categoryList,
                    viewModel = viewModel,
                    priorityExpended = priorityExpended,
                    ticketExpended = ticketExpended,
                    priorityValue = priorityValue,
                    ticketValue = ticketValue,
                    subjectValue = subjectValue
                )
            } else if (a.equals("text")) {
                TextInputDialog(viewModel = viewModel)
            } else if (a.equals("end")) {
                DoneDialog(viewModel = viewModel)
            }

        }
    }

}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChooseBox(
    modifier: Modifier,
    list: List<CategoryItem?>?,
    expanded: Boolean,
    selectedOptionText: CategoryItem?,
    label: String = "موضوه",
    onExpendedChanged: () -> Unit,
    onValueChange: (CategoryItem?) -> Unit,
    error: Boolean = false
) {

    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = {
            onExpendedChanged()
        }
    ) {

        OutlinedTextField(
            readOnly = true,
            value = if (selectedOptionText == null) "" else "${selectedOptionText!!.perName.toString()}",
            onValueChange = {

            },
            label = {
                Text(
                    "$label",
                    fontFamily = kalameh_regular,
                    fontSize = 13.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            trailingIcon = {
                if (list.isNullOrEmpty()) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(20.dp),
                        strokeWidth = 3.dp,
                        color = primary
                    )
                } else
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expanded
                    )
            },
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
            textStyle = TextStyle(fontFamily = kalameh_regular),
            isError = error
        )
        if (!list.isNullOrEmpty())
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    onExpendedChanged()
                }
            ) {
                list.forEach { selectionOption ->
                    DropdownMenuItem(
                        onClick = {
                            onValueChange(selectionOption)
                        }
                    ) {
                        Text(
                            text = "${selectionOption!!.perName}",
                            fontFamily = kalameh_regular,
                            fontSize = 15.sp
                        )
                    }
                }
            }
    }
}

@Composable
fun CustomTextField(
    title: String = "موضوع",
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
                Text(text = "$title", fontFamily = kalameh_regular, fontSize = 13.sp)
            },
            placeholder = {
                Text(text = "$placeholder", fontFamily = kalameh_regular, fontSize = 13.sp)
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
            textStyle = TextStyle(fontSize = 13.sp, fontFamily = kalameh_regular),
        )
    }

}

@Composable
fun CustomButton_(
    onClick: () -> Unit,
    text: String,
    fontSize: Dp = 20.dp,
    roundedCornerShape: RoundedCornerShape = RoundedCornerShape(5.dp),
    modifier: Modifier,
    inProgress: Boolean = false
) {

    OutlinedButton(
        modifier = modifier,
        contentPadding = PaddingValues(start = 5.dp, end = 5.dp, top = 0.dp, bottom = 0.dp),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = primary,
            contentColor = Color.White,
        ),
        shape = roundedCornerShape,
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
            Text(
                text = "$text",
                fontFamily = kalameh_bold,
                fontSize = fontSize.value.sp,
            )
    }
}

@Composable
fun TextInputDialog(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel,
) {

    val textValue = viewModel.textValue.collectAsState().value
    val textEmptyError = viewModel.textEmptyError.collectAsState().value

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = modifier,
            elevation = 8.dp
        ) {

            Column() {
                Icon(
                    Icons.Default.Close,
                    contentDescription = "",
                    tint = Color.Black.copy(alpha = .4f),
                    modifier = Modifier
                        .padding(top = 13.dp, start = 13.dp, bottom = 0.dp)
                        .clickable { viewModel.onEvent(HomeEvent.OnCloseDialog) }
                )
                Column(
                    modifier
                        .background(Color.White)
                        .padding(bottom = 10.dp, start = 25.dp, end = 25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    Text(
                        text = "تیکت جدید",
                        fontFamily = kalameh_bold,
                        fontSize = 20.sp,
                        color = primary,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    OutlinedTextField(
                        value = textValue,
                        onValueChange = { viewModel.onEvent(HomeEvent.OnTextValueChanged(it)) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        textStyle = TextStyle(
                            textAlign = TextAlign.Right,
                            fontFamily = kalameh_regular
                        ),
                        placeholder = { Text(text = "پیام شما", fontFamily = kalameh_regular) },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            cursorColor = primary,
                        ),
                        shape = RoundedCornerShape(10.dp),
                        label = {
                            Text(text = "پیام شما", fontFamily = kalameh_regular)
                        },
                        isError = textEmptyError
                    )

                    CustomButton_(
                        onClick = { viewModel.onEvent(HomeEvent.OnToEnd) },
                        text = "ادامه",
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .height(30.dp)
                            .align(Alignment.Start),
                        fontSize = 13.dp
                    )

                }
            }

        }
    }

}

@Composable
fun DoneDialog(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel,
) {

    val sendResponse = viewModel.sendResponse.collectAsState(initial = null).value

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column() {

            IconButton(
                onClick = { viewModel.onEvent(HomeEvent.OnCloseDialog) },
                modifier = Modifier.padding(top = 5.dp, start = 4.dp)
            ) {
                Icon(
                    Icons.Default.Close,
                    contentDescription = "",
                    tint = Color.Black.copy(alpha = .4f)
                )
            }

            Image(
                painterResource(id = R.drawable.ic_flysky_2),
                contentDescription = null, // decorative
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .align(Alignment.CenterHorizontally),
                alignment = Alignment.Center
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 17.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                if (sendResponse == null) {
                    Box(
                        modifier = Modifier
                            .size(55.dp)
                            .padding(top = 10.dp)
                    ) {
                        CircularProgressIndicator(
                            strokeWidth = 5.dp, color = primary
                        )
                    }

                    Text(
                        text = "در حال ارسال",
                        fontSize = 20.sp,
                        fontFamily = kalameh_bold,
                        modifier = Modifier.padding(top = 7.dp)
                    )

                } else if (sendResponse == true) {

                    BoxEnd("", "")

                    CustomButton_(
                        onClick = { viewModel.onEvent(HomeEvent.OnCloseDialog) },
                        text = "اتمام",
                        modifier = Modifier
                            .padding(top = 5.dp, start = 25.dp, bottom = 25.dp)
                            .height(30.dp)
                            .align(Alignment.Start),
                        fontSize = 13.dp
                    )
                } else {

                }
            }

        }

    }

}

@Composable
fun SelectInfo(
    modifier: Modifier = Modifier,
    openDialog: () -> Unit,
    priorityCatList: List<CategoryItem.PriorityCat>,
    categoryList: List<CategoryItem.TicketCat>,
    viewModel: HomeViewModel,
    priorityExpended: Boolean,
    ticketExpended: Boolean,
    priorityValue: CategoryItem?,
    ticketValue: CategoryItem?,
    subjectValue: String?,
) {
    val priorityEmpty = viewModel.priorityEmptyError.collectAsState(false).value
    val statusEmpty = viewModel.ticketEmptyError.collectAsState(false).value
    val subjectEmpty = viewModel.subjectEmptyError.collectAsState(false).value
    Column() {

        Icon(
            Icons.Default.Close,
            contentDescription = "",
            tint = Color.Black.copy(alpha = .4f),
            modifier = Modifier
                .padding(top = 13.dp, start = 13.dp, bottom = 0.dp)
                .clickable { viewModel.onEvent(HomeEvent.OnCloseDialog) }
        )

        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 10.dp, start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Text(
                text = "تیکت جدید",
                fontFamily = kalameh_bold,
                fontSize = 20.sp,
                color = primary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
            )

            Spacer(modifier = Modifier.height(11.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(2.dp),
                modifier = Modifier.fillMaxWidth()
            ) {


                CustomTextField(
                    placeholder = "موضوع",
                    onValueChange = { viewModel.onEvent(HomeEvent.OnSubjectValueChanged(it)) },
                    value = subjectValue!!,
                    isError = subjectEmpty
                )

                ChooseBox(
                    modifier = Modifier,
                    list = categoryList,
                    selectedOptionText = ticketValue,
                    onExpendedChanged = { viewModel.onEvent(HomeEvent.OnTicketCatExpendedChanged) },
                    onValueChange = { viewModel.onEvent(HomeEvent.OnTicketValueChanged(it)) },
                    label = "دسته بندی",
                    expanded = ticketExpended,
                    error = statusEmpty
                )

                ChooseBox(
                    modifier = Modifier,
                    list = priorityCatList,
                    selectedOptionText = priorityValue,
                    onExpendedChanged = { viewModel.onEvent(HomeEvent.OnPriorityExpendedChanged) },
                    onValueChange = { viewModel.onEvent(HomeEvent.OnPriorityValueChanged(it)) },
                    label = "اولویت",
                    expanded = priorityExpended,
                    error = priorityEmpty
                )
            }

            CustomButton_(
                onClick = { viewModel.onEvent(HomeEvent.OnToTextScreen) },
                text = "ادامه",
                modifier = Modifier
                    .padding(top = 25.dp)
                    .height(30.dp)
                    .align(Alignment.Start),
                fontSize = 13.dp
            )

        }
    }
}

@Composable
fun BoxEnd(text1: String, text2: String) {

    Box(
        modifier = Modifier
            .size(210.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_box),
            contentDescription = "",
            modifier = Modifier
                .size(210.dp),
            contentScale = ContentScale.Fit
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "#حس_خوب_آغاز_یک_سفر",
                fontFamily = kalameh_bold,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 114.dp),
                color = Color.White
            )

            Text(
                text = "هدیه ی ما به شما",
                fontFamily = kalameh_bold,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 14.dp),
                color = Color.White
            )

        }


    }

}

@Preview
@Composable
fun preview() {
    BoxEnd("", "")
}
