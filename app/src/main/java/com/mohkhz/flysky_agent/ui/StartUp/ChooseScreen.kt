package com.mohkhz.covid19_compose.ui.Chooser

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mohkhz.flysky_agent.R
import com.mohkhz.flysky_agent_support.util.UiEvent
import kotlinx.coroutines.flow.collect

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
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painterResource(id = R.drawable.flysky_logo),
            contentDescription = "",
            Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        if (loginProgress)
            CircularProgressIndicator(
                modifier = Modifier
                    .padding(20.dp)
                    .size(20.dp),
                strokeWidth = 5.dp
            )

    }
}