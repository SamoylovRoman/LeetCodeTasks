package com.codelabs.leetcodeproject.easy

class CreateTargetArrayInTheGivenOrder {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val array = mutableListOf<Int>()
        for (i in nums.indices) {
            array.add(index[i], nums[i])
        }
        return array.toIntArray()
    }
}

fun main() {
    val obj = CreateTargetArrayInTheGivenOrder()
    obj.createTargetArray(intArrayOf(0, 1, 2, 3, 4), intArrayOf(0, 1, 2, 2, 1)).forEach {
        print("$it ")
    }
    println()
    obj.createTargetArray(intArrayOf(1, 2, 3, 4, 0), intArrayOf(0, 1, 2, 3, 0)).forEach {
        print("$it ")
    }
    println()
    obj.createTargetArray(intArrayOf(1), intArrayOf(0)).forEach {
        print("$it ")
    }
    println()
}