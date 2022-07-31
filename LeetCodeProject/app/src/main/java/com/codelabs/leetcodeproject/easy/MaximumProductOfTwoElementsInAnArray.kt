package com.codelabs.leetcodeproject.easy

class MaximumProductOfTwoElementsInAnArray {
    fun maxProduct(nums: IntArray): Int {
        var max = (nums[0] - 1) * (nums[1] - 1)
        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) {
                    max = (nums[i] - 1) * (nums[j] - 1)
                }
            }
        }
        return max
    }
}

fun main() {
    val obj = MaximumProductOfTwoElementsInAnArray()
    println(obj.maxProduct(intArrayOf(3, 4, 5, 2)))
    println(obj.maxProduct(intArrayOf(1, 5, 4, 5)))
    println(obj.maxProduct(intArrayOf(3, 7)))
}