package com.mohkhz.flysky_agent_support.util

sealed class UiEvent {
    object PopBackStack: UiEvent()
    data class Navigate(val route: String) : UiEvent()

}