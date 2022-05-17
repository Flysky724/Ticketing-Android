package com.mohkhz.covid19_compose.ui.Chooser

sealed class ChooseEvent {
    object OnLogin : ChooseEvent()
    data class OnHome(val userId:String) : ChooseEvent()
}
