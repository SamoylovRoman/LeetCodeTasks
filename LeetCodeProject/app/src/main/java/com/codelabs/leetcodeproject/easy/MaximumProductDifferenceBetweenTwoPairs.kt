package com.codelabs.leetcodeproject.easy

class MaximumProductDifferenceBetweenTwoPairs {
    fun maxProductDifference(nums: IntArray): Int {
        val sortedNums = nums.sorted()
        return sortedNums[sortedNums.size - 1] * sortedNums[sortedNums.size - 2] - sortedNums[0] * sortedNums[1]
    }
}

fun main() {
    val obj = MaximumProductDifferenceBetweenTwoPairs()
    println(obj.maxProductDifference(intArrayOf(5, 6, 2, 7, 4)))
    println(obj.maxProductDifference(intArrayOf(4, 2, 5, 9, 7, 4, 8)))
}