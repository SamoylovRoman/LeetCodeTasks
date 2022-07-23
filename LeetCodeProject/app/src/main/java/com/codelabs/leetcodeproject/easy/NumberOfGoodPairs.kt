package com.codelabs.leetcodeproject.easy

class NumberOfGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0
        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] && i < j) {
                    count++
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = NumberOfGoodPairs()
    println(obj.numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
    println(obj.numIdenticalPairs(intArrayOf(1, 1, 1, 1)))
    println(obj.numIdenticalPairs(intArrayOf(1, 2, 3)))
}