package com.codelabs.leetcodeproject.easy

class MakeArrayZeroBySubtractingEqualAmounts {
    fun minimumOperations(nums: IntArray): Int {
        return nums.toSet().count { it > 0 }
    }
}

fun main() {
    val obj = MakeArrayZeroBySubtractingEqualAmounts()
    println(obj.minimumOperations(intArrayOf(1, 5, 0, 3, 5)))
    println(obj.minimumOperations(intArrayOf(0)))
}