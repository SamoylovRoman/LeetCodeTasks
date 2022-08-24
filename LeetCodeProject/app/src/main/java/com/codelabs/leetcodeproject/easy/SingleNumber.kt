package com.codelabs.leetcodeproject.easy

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        nums.groupBy { it }.forEach {
            if (it.value.size == 1) return it.key
        }
        return 0
    }
}

fun main() {
    val obj = SingleNumber()
    println(obj.singleNumber(intArrayOf(2, 2, 1)))
    println(obj.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    println(obj.singleNumber(intArrayOf(1)))
}