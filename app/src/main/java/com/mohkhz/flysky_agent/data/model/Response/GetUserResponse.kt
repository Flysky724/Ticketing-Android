package com.mohkhz.flysky_agent.data.model.Response

import com.mohkhz.flysky_agent_support.data.model.User

data class GetUserResponse(
    var status_code: String,
    var message: String,
    var user: User?
)