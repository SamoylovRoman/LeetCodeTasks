package com.codelabs.leetcodeproject.easy

class MinimumSubsequenceInNonIncreasingOrder {
    fun minSubsequence(nums: IntArray): List<Int> {
        nums.sort()
        val list = mutableListOf<Int>()
        var sum1 = nums.sum()
        var sum2 = 0
        for (i in nums.size - 1 downTo 0) {
            sum1 -= nums[i]
            sum2 += nums[i]
            list += nums[i]
            if (sum2 > sum1) {
                break
            }
        }
        return list
    }
}

fun main() {
    val obj = MinimumSubsequenceInNonIncreasingOrder()
    obj.minSubsequence(intArrayOf(4, 3, 10, 9, 8)).forEach { print("$it ") }
    println()
    obj.minSubsequence(intArrayOf(4, 4, 7, 6, 7)).forEach { print("$it ") }
    println()
}