package com.mohkhz.flysky_agent.data.model.Response

import com.mohkhz.flysky_agent.data.model.Messages

data class MessageListResponse(
    var list: List<Messages>,
    var status_code: String,
    var message: String,
)