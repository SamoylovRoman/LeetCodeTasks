package com.codelabs.leetcodeproject.easy

class SortArrayByParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        return (nums.filter { it % 2 == 0 } + nums.filter { it % 2 != 0 }).toIntArray()
    }
}

fun main() {
    val obj = SortArrayByParity()
    obj.sortArrayByParity(intArrayOf(3, 1, 2, 4)).forEach { print("$it ") }
    println()
    obj.sortArrayByParity(intArrayOf(0)).forEach { print("$it ") }
    println()
}