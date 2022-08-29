package com.codelabs.leetcodeproject.easy

import kotlin.math.abs

class CanMakeArithmeticProgressionFromSequence {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        val sortedArr = arr.sorted()
        val dif = sortedArr[1] - sortedArr[0]
        for (i in 1..sortedArr.size - 2) {
            if (sortedArr[i] + dif != sortedArr[i + 1]) return false
        }
        return true
    }
}

fun main() {
    val obj = CanMakeArithmeticProgressionFromSequence()
    println(obj.canMakeArithmeticProgression(intArrayOf(-68, -96, -12, -40, 16)))
    println(obj.canMakeArithmeticProgression(intArrayOf(3, 5, 1)))
    println(obj.canMakeArithmeticProgression(intArrayOf(1, 2, 4)))
}
