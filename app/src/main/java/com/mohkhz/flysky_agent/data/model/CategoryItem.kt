package com.mohkhz.flysky_agent_support.data.model

sealed class CategoryItem(
    var id: String?,
    var perName: String?,
) {
    class PriorityCat(
        id: String?,
        perName: String?,
    ) : CategoryItem(id, perName)

    class TicketStatusCat(
        id: String?,
        perName: String?,
    ) : CategoryItem(id, perName)

    class TicketCat(
        id: String?,
        perName: String?,
    ) : CategoryItem(id, perName)

}
