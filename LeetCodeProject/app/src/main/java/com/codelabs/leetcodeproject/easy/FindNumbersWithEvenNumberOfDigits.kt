package com.codelabs.leetcodeproject.easy

class FindNumbersWithEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        return nums.count { it.toString().length % 2 == 0 }
    }
}

fun main() {
    val obj = FindNumbersWithEvenNumberOfDigits()
    println(obj.findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
    println(obj.findNumbers(intArrayOf(555, 901, 482, 1771)))
}