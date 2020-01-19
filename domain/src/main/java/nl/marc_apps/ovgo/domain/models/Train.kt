package nl.marc_apps.ovgo.domain.models

data class Train(
    val image: String?,
    val number: Int?,
    val type: String,
    val hasWifi: Boolean,
    val hasPowerSockets: Boolean,
    val isAccessible: Boolean
)