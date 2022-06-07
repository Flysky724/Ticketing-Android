package com.mohkhz.flysky_agent.ui.NewAgent

sealed class NewAgentEvent {

    data class OnAddClick(var back: () -> Unit) : NewAgentEvent()
    object OnInfoClick : NewAgentEvent()

    data class OnFistNameValueChange(var text: String) : NewAgentEvent()
    data class OnLastNameValueChange(var text: String) : NewAgentEvent()
    data class OnWebsiteValueChange(var text: String) : NewAgentEvent()
    data class OnPhoneValueChange(var text: String) : NewAgentEvent()
}
