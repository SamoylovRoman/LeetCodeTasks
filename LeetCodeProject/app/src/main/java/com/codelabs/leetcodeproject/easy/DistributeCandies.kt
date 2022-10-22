package com.codelabs.leetcodeproject.easy

import kotlin.math.min

class DistributeCandies {
    fun distributeCandies(candyType: IntArray): Int {
        return min(candyType.toSet().size, candyType.size / 2)
    }
}

fun main() {
    val obj = DistributeCandies()
    println(obj.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)))
    println(obj.distributeCandies(intArrayOf(1, 1, 2, 3)))
    println(obj.distributeCandies(intArrayOf(6, 6, 6, 6)))
}