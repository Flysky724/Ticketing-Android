package com.mohkhz.flysky_agent.ui.login

import com.mohkhz.flysky_agent_support.data.model.User

sealed class LoginEvent {
    object OnInfoClick : LoginEvent()
    object OnInfoClose : LoginEvent()
    object OnLoginClick : LoginEvent()
    data class OnWebSiteChangeVal(val value: String) : LoginEvent()
    data class OnNumberChangeVal(val value: String) : LoginEvent()
    data class GoToHome(val user: User) : LoginEvent()
}