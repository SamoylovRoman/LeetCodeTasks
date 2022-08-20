package com.codelabs.leetcodeproject.easy

class SmallestIndexWithEqualValue {
    fun smallestEqual(nums: IntArray): Int {
        for (i in nums.indices) {
            if (i % 10 == nums[i]) return i
        }
        return -1
    }
}

fun main() {
    val obj = SmallestIndexWithEqualValue()
    println(obj.smallestEqual(intArrayOf(0, 1, 2)))
    println(obj.smallestEqual(intArrayOf(4, 3, 2, 1)))
    println(obj.smallestEqual(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
}