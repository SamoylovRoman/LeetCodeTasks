package com.codelabs.leetcodeproject.easy

class FindTheMiddleIndexInArray {
    fun findMiddleIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = nums.sum()
        for ((index, num) in nums.withIndex()) {
            rightSum -= num
            if (leftSum == rightSum) {
                return index
            }
            leftSum += num
        }
        return -1
    }
}

fun main() {
    val obj = FindTheMiddleIndexInArray()
    println(obj.findMiddleIndex(intArrayOf(2, 3, -1, 8, 4)))
    println(obj.findMiddleIndex(intArrayOf(1, -1, 4)))
    println(obj.findMiddleIndex(intArrayOf(2, 5)))
}