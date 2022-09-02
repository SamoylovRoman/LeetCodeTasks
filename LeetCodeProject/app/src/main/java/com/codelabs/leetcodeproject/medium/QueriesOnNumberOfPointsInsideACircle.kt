package com.codelabs.leetcodeproject.medium

import kotlin.math.pow

class QueriesOnNumberOfPointsInsideACircle {
    fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val arr = IntArray(queries.size) { 0 }
        for (i in queries.indices) {
            for (j in points.indices) {
                if (
                    ((queries[i][0] - points[j][0]).toDouble().pow(2)
                            + (queries[i][1] - points[j][1]).toDouble().pow(2))
                    <= queries[i][2] * queries[i][2]
                ) {
                    arr[i]++
                }
            }
        }
        return arr
    }
}

fun main() {
    val obj = QueriesOnNumberOfPointsInsideACircle()
    obj.countPoints(
        arrayOf(
            intArrayOf(1, 3),
            intArrayOf(3, 3),
            intArrayOf(5, 3),
            intArrayOf(2, 2)
        ),
        arrayOf(intArrayOf(2, 3, 1), intArrayOf(4, 3, 1), intArrayOf(1, 1, 2))
    ).forEach { print("$it ") }
}