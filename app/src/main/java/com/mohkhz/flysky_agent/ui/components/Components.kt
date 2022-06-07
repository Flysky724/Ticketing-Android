package com.mohkhz.flysky_agent.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.*
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent.ui.login.CustomButton
import com.mohkhz.flysky_agent.ui.theme.kalameh_bold
import com.mohkhz.flysky_agent.ui.theme.kalameh_regular
import com.mohkhz.flysky_agent.ui.theme.kalameh_semi_bold
import com.mohkhz.flysky_agent.ui.theme.secondColor

@OptIn(ExperimentalUnitApi::class)
@Composable
fun InfoBottomSheetContent(doneClose: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 20.dp, horizontal = 30.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Icon(
                painterResource(id = R.drawable.ic_notif),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.size(48.dp)
            )

            Text(
                text = "برنامه پشتیبانی نمایندگان \n فلای اسکای ۷۲۴",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                fontFamily = kalameh_bold,
                modifier = Modifier.padding(top = 5.dp),
                color = Color(0xff313131)
            )

            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                            )
                        ) {
                            append("این سیستم توسط فلای اسکای ۷۲۴ طراحی شده است.\n")
                        }
                        withStyle(
                            style = SpanStyle(
                            ),
                        ) {
                            append("درصورت هر گونه مشکل با پشتیبانی ۲۴ ساعت تماس بگیرید.")
                        }
                    },
                    modifier = Modifier.padding(top = 8.dp),
                    lineHeight = 20.sp,
                    letterSpacing = TextUnit(.1f, TextUnitType.Sp),
                    textAlign = TextAlign.Center,
                    fontFamily = kalameh_regular,
                    fontSize = 14.sp,

                    )
            }

            Card(
                shape = RoundedCornerShape(13.dp),
                backgroundColor = secondColor,
                modifier = Modifier.padding(top = 22.dp),
            ) {
                Row(
                    modifier = Modifier.padding(vertical = 5.dp, horizontal = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Phone,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(20.dp),
                    )
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
                roundedCornerShape = RoundedCornerShape(10.dp),
                fontSize = 15.dp,
                modifier = Modifier
                    .padding(start = 25.dp, end = 25.dp, bottom = 13.dp, top = 16.dp)
                    .width(255.dp),
                contentPadding = PaddingValues(5.dp)
            )

        }

    }
}

@Composable
fun Progress() {
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
            text = "در حال دریافت اطلاعات...",
            fontSize = 15.sp,
            fontFamily = kalameh_semi_bold,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(8.dp)
        )

    }
}