package com.codelabs.leetcodeproject.easy

import kotlin.math.abs

class CountNumberOfPairsWithAbsoluteDifferenceK {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0
        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size) {
                if (abs(nums[i] - nums[j]) == k) {
                    count++
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = CountNumberOfPairsWithAbsoluteDifferenceK()
    println(obj.countKDifference(intArrayOf(1, 2, 2, 1), 1))
    println(obj.countKDifference(intArrayOf(1, 3), 3))
    println(obj.countKDifference(intArrayOf(3, 2, 1, 5, 4), 2))
}