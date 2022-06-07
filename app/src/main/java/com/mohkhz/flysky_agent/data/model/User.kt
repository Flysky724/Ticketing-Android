package com.mohkhz.flysky_agent_support.data.model

import javax.inject.Inject


data class User(
    var id: Int?,
    var website: String?,
    var userName: String?,
    var phoneNumber: String?,
    var category: String?,

    ) {
    @Inject
    constructor() : this(0, "", "", "", "")

    fun getNames(): Array<String> {
        val name = this.userName
        val array = name!!.split("/").toTypedArray()
        return array
    }
}
