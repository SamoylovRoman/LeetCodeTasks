package com.codelabs.leetcodeproject.easy

class RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        nums.forEachIndexed { index, i ->
            sum += i
            nums[index] = sum
        }
        return nums
    }
}

fun main() {
    val obj = RunningSumOf1dArray()
    obj.runningSum(intArrayOf(1, 2, 3, 4)).forEach {
        print("$it ")
    }
    println()
    obj.runningSum(intArrayOf(1, 1, 1, 1, 1)).forEach {
        print("$it ")
    }
    println()
    obj.runningSum(intArrayOf(3, 1, 2, 10, 1)).forEach {
        print("$it ")
    }
    println()
}