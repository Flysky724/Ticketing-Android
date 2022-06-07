package com.mohkhz.flysky_agent.ui.Ticket

sealed class TicketEvent {

    data class OnTextChange(val text: String) : TicketEvent()
    object OnSendClick : TicketEvent()

}
