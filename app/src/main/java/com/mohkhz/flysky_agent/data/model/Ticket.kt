package com.mohkhz.flysky_agent_support.data.model

import javax.inject.Inject

data class Ticket(
    var id: String?,
    var creatorId: String?,
    var TCategory: String?,// ticket cat
    var SCategory: String?, //status
    var PCategory: String?, // priority
    var title: String?,
) {

    @Inject
    constructor() : this("", "", "", "", "", "")

}
