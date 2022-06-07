package com.mohkhz.flysky_agent.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mohkhz.flysky_agent.R

val kalameh_bold = FontFamily(
    Font(R.font.kalameh_bold),
)
val kalameh_regular = FontFamily(
    Font(R.font.kalameh_regular),
)
val kalameh_semi_bold = FontFamily(
    Font(R.font.kalameh_semi_bold),
)

val kalameh_num_bold = FontFamily(Font(R.font.kalame_num_bold))

val kalameh_medium = FontFamily(Font(R.font.kalameh_medium))

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)