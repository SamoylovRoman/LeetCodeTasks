package com.codelabs.leetcodeproject.easy

// https://leetcode.com/problems/two-sum/

class TwoSumClass {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..nums.size - 2) {
            for (j in (i + 1) until nums.size) {
                if ((nums[i] + nums[j]) == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(0, 0)
    }
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val twoSum = TwoSumClass()
    twoSum.twoSum(nums, target).forEach {
        println(it)
    }
}