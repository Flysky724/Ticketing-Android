package com.mohkhz.flysky_agent.data.model.Response

import com.mohkhz.flysky_agent_support.data.model.Ticket

data class TicketListResponse(
    var status_code: String,
    var message: String,
    var list: List<Ticket>
)
