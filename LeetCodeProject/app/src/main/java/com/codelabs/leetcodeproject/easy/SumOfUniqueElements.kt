package com.codelabs.leetcodeproject.easy

class SumOfUniqueElements {
    fun sumOfUnique(nums: IntArray): Int {
//        return nums.groupBy { it }.filter { it.value.size == 1 }.keys.sum()
        return nums.filter { n -> nums.count { it == n } < 2 }.sum()
    }
}

fun main() {
    val obj = SumOfUniqueElements()
    println(obj.sumOfUnique(intArrayOf(1, 2, 3, 2)))
    println(obj.sumOfUnique(intArrayOf(1, 1, 1, 1, 1)))
    println(obj.sumOfUnique(intArrayOf(1, 2, 3, 4, 5)))
}