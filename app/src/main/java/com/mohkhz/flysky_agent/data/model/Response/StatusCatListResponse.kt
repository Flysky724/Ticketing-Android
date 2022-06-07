package com.mohkhz.flysky_agent.data.model.Response

import com.mohkhz.flysky_agent_support.data.model.CategoryItem

class StatusCatListResponse(
    var status_code: Int,
    var message: String,
    val list: List<CategoryItem.TicketStatusCat>
)