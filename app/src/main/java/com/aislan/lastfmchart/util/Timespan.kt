package com.aislan.lastfmchart.util

import java.sql.Time

enum class Timespan(val time: String) {
    ALL_TIME("All time"),
    LAST_WEEK("Last week"),
    LAST_MONTH("Last month"),
    LAST_3_MONTHS("Last 3 months"),
    LAST_6_MONTHS("Last 6 months"),
    LAST_YEAR("Last year")
}

fun getTimespan(): List<Timespan> {
    val timespanList = mutableListOf<Timespan>()
    timespanList.add(Timespan.ALL_TIME)
    timespanList.add(Timespan.LAST_WEEK)
    timespanList.add(Timespan.LAST_MONTH)
    timespanList.add(Timespan.LAST_3_MONTHS)
    timespanList.add(Timespan.LAST_6_MONTHS)
    timespanList.add(Timespan.LAST_YEAR)

    return timespanList
}