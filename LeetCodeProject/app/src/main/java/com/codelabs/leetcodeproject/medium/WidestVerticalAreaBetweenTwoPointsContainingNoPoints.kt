package com.codelabs.leetcodeproject.medium

class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
//        val list = points.map { it[0] }.toSortedSet().toList()
        points.sortBy { it[0] }
        var widestArea = 0
        for (i in 0..points.size - 2) {
            if (points[i + 1][0] - points[i][0] > widestArea) {
                widestArea = points[i + 1][0] - points[i][0]
            }
        }
        return widestArea
    }
}

fun main() {
    val obj = WidestVerticalAreaBetweenTwoPointsContainingNoPoints()
    println(
        obj.maxWidthOfVerticalArea(
            arrayOf(
                intArrayOf(8, 7),
                intArrayOf(9, 9),
                intArrayOf(7, 4),
                intArrayOf(9, 7)
            )
        )
    )
    println(
        obj.maxWidthOfVerticalArea(
            arrayOf(
                intArrayOf(3, 1),
                intArrayOf(9, 0),
                intArrayOf(1, 0),
                intArrayOf(1, 4),
                intArrayOf(5, 3),
                intArrayOf(8, 8)
            )
        )
    )
}