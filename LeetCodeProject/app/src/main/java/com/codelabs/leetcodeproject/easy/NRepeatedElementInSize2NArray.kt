package com.codelabs.leetcodeproject.easy

class NRepeatedElementInSize2NArray {
    fun repeatedNTimes(nums: IntArray): Int {
        return nums.groupBy { it }.filter { it.value.size == nums.size/2 }.keys.first()
    }
}

fun main() {
    val obj=NRepeatedElementInSize2NArray()
    println(obj.repeatedNTimes(intArrayOf(1,2,3,3)))
    println(obj.repeatedNTimes(intArrayOf(2,1,2,5,3,2)))
    println(obj.repeatedNTimes(intArrayOf(5,1,5,2,5,3,5,4)))
}