package com.codelabs.leetcodeproject.easy

class FindGreatestCommonDivisorOfArray {
    fun findGCD(nums: IntArray): Int {
        var min = nums[0]
        var max = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] < min) {
                min = nums[i]
            } else {
                if (nums[i] > max) {
                    max = nums[i]
                }
            }
        }
        for (divisor in min downTo 1) {
            if (max % divisor == 0 && min % divisor == 0) {
                return divisor
            }
        }
        return 1
    }
}

fun main() {
    val obj = FindGreatestCommonDivisorOfArray()
    println(obj.findGCD(intArrayOf(2, 5, 6, 9, 10)))
    println(obj.findGCD(intArrayOf(7, 5, 6, 8, 3)))
    println(obj.findGCD(intArrayOf(3, 3)))
}