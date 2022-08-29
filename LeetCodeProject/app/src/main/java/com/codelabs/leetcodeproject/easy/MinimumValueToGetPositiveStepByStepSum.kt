package com.codelabs.leetcodeproject.easy

import kotlin.math.min

class MinimumValueToGetPositiveStepByStepSum {
    fun minStartValue(nums: IntArray): Int {
        var minValue = 0
        var sum = 0
        nums.forEach {
            sum += it
            minValue = min(minValue, sum)
        }
        return 1 - minValue
    }
}

fun main() {
    val obj = MinimumValueToGetPositiveStepByStepSum()
    println(obj.minStartValue(intArrayOf(-3, 2, -3, 4, 2)))
    println(obj.minStartValue(intArrayOf(1, 2)))
    println(obj.minStartValue(intArrayOf(1, -2, -3)))
}