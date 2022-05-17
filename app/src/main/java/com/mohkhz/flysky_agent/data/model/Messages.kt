package com.mohkhz.flysky_agent.data.model

data class Messages(
    var id: Int,
    var text: String,
    var date: String,
    var read: Boolean,
    var tId: Int,
    var uId: Int,
)