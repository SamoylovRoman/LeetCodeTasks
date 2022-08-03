package com.codelabs.leetcodeproject.easy

class MinimumOperationsToMakeTheArrayIncreasing {
    fun minOperations(nums: IntArray): Int {
        var nextElement = nums[0] + 1
        var count = 0
        for (i in 1 until nums.size) {
            if (nums[i] > nextElement) {
                nextElement = nums[i] + 1
            } else {
                count += (nextElement - nums[i])
                nextElement++
            }
        }
        return count
    }
}

fun main() {
    val obj = MinimumOperationsToMakeTheArrayIncreasing()
    println(obj.minOperations(intArrayOf(1, 1, 1)))
    println(obj.minOperations(intArrayOf(1, 5, 2, 4, 1)))
    println(obj.minOperations(intArrayOf(8)))
}