package com.codelabs.leetcodeproject.easy

import kotlin.math.max
import kotlin.math.min

class NumberOfRectanglesThatCanFormTheLargestSquare {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
        var maxLength = 0
        rectangles.forEach {
            if (min(it[0], it[1]) > maxLength) {
                maxLength = min(it[0], it[1])
            }
        }
        return rectangles.count { it[0] >= maxLength && it[1] >= maxLength }
    }
}

fun main() {
    val obj = NumberOfRectanglesThatCanFormTheLargestSquare()
    println(
        obj.countGoodRectangles(
            arrayOf(
                intArrayOf(5, 8),
                intArrayOf(3, 9),
                intArrayOf(5, 12),
                intArrayOf(16, 5)
            )
        )
    )
}