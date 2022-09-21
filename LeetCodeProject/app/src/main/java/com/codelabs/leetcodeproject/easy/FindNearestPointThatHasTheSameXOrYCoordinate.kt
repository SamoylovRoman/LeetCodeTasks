package com.codelabs.leetcodeproject.easy

import kotlin.math.abs

class FindNearestPointThatHasTheSameXOrYCoordinate {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var minDistance = Int.MAX_VALUE
        var minDistanceIndex = -1
        for (i in points.indices) {
            if (points[i][0] == x || points[i][1] == y) {
                if (abs(points[i][0] - x) + abs(points[i][1] - y) < minDistance) {
                    minDistance = abs(points[i][0] - x) + abs(points[i][1] - y)
                    minDistanceIndex = i
                }
            }
        }
        return minDistanceIndex
    }
}

fun main() {
    val obj = FindNearestPointThatHasTheSameXOrYCoordinate()
    println(
        obj.nearestValidPoint(
            3,
            4,
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 1),
                intArrayOf(2, 4),
                intArrayOf(2, 3),
                intArrayOf(4, 4)
            )
        )
    )
    println(
        obj.nearestValidPoint(
            3,
            4,
            arrayOf(
                intArrayOf(3, 4)
            )
        )
    )
    println(
        obj.nearestValidPoint(
            3,
            4,
            arrayOf(
                intArrayOf(2, 3)
            )
        )
    )
}