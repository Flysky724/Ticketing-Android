package com.mohkhz.flysky_agent_support.data.model

import javax.inject.Inject

data class Ticket(
    var id: String?,
    var creatorId: String?,
    var category: String?,// ticket cat
    var status: String?, //status
    var priority: String?, // priority
    var title: String?,
    var createDate: String?,
    val lastMessage: String?,
    val sendLastMessage: String?
) {

    @Inject
    constructor() : this("", "", "", "", "", "", "", "", "")

}
