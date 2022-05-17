package com.mohkhz.flysky_agent_support.data.model

sealed class CategoryItem(
    var id: String?,
    var name: String?,
    var perName: String?,
) {

    class PriorityCat(
        id: String?,
        name: String?,
        perName: String?,
    ) : CategoryItem(id, name, perName)

    class TicketStatusCat(
        id: String?,
        name: String?,
        perName: String?,
    ) : CategoryItem(id, name, perName)

    class TicketCat(
        id: String?,
        name: String?,
        perName: String?,
    ) : CategoryItem(id, name, perName)

}
