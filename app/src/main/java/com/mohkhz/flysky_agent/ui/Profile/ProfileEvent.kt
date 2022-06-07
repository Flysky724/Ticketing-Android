package com.mohkhz.flysky_agent.ui.Profile

import android.content.Context

sealed class ProfileEvent {

    data class OnWhatsAppClick(val context: Context) : ProfileEvent()
    data class OnEnterSiteClick(val context: Context) : ProfileEvent()
    object OnNewAgentClick : ProfileEvent()
    object OnLogOutClick : ProfileEvent()
    object OnBackClick : ProfileEvent()


}
