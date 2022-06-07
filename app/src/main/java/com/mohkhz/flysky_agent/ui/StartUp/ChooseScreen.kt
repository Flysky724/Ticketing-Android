package com.mohkhz.covid19_compose.ui.Chooser

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent_support.util.UiEvent

@Composable
fun ChooserScreen(
    viewModel: ChooserViewModel = hiltViewModel(),
    onObserver: (ChooserViewModel) -> Unit,
    onNavigate: (UiEvent.Navigate) -> Unit,
) {

    val loginProgress = viewModel.loginProgress.collectAsState().value

    LaunchedEffect(key1 = true) {

        onObserver(viewModel)

        viewModel.uiEvent.collect {
            when (it) {
                is UiEvent.Navigate -> {
                    onNavigate(it)
                }
                else -> Unit
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xff6B1FDC),
                        Color(0xff36106E),
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            painterResource(id = R.drawable.ic_flyksy),
            contentDescription = "",
            Modifier
                .size(195.dp)
                .padding(bottom = 150.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(0.dp))

        if (loginProgress)
            CircularProgressIndicator(
                modifier = Modifier
                    .size(30.dp),
                strokeWidth = 4.dp,
                color = Color.White
            )

    }
}