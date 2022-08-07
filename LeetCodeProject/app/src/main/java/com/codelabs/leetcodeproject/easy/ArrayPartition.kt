package com.codelabs.leetcodeproject.easy

import kotlin.math.min

class ArrayPartition {
    fun arrayPairSum(nums: IntArray): Int {
        return nums.sorted().chunked(2).sumBy { min(it[0], it[1]) }
    }
}

fun main() {
    val obj = ArrayPartition()
    println(obj.arrayPairSum(intArrayOf(1, 4, 3, 2)))
    println(obj.arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2)))
}