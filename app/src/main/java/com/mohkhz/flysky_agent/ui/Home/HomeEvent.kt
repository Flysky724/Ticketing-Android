package com.mohkhz.flysky_agent.ui.Home

import com.mohkhz.flysky_agent_support.data.model.CategoryItem

sealed class HomeEvent {

    object OnNewTicketClick : HomeEvent()
    object OnProfileClick : HomeEvent()
    object OnNotification : HomeEvent()
    object OnInfoClick : HomeEvent()
    object OnToTextScreen : HomeEvent()
    object OnToEnd : HomeEvent()
    object OnCloseDialog : HomeEvent()

    object OnPriorityExpendedChanged : HomeEvent()
    object OnTicketCatExpendedChanged : HomeEvent()
    data class OnPriorityValueChanged(val value: CategoryItem?) : HomeEvent()
    data class OnTicketValueChanged(val value: CategoryItem?) : HomeEvent()
    data class OnTicketStatusValueChanged(val value: CategoryItem?) : HomeEvent()
    data class OnSubjectValueChanged(val value: String) : HomeEvent()
    data class OnTextValueChanged(val value: String) : HomeEvent()

    data class OnTicketClick(val tId: String) : HomeEvent()

    object OnRefresh:HomeEvent()

}
