package com.codelabs.leetcodeproject.easy

class KeepMultiplyingFoundValuesByTwo {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        var ori = original
        var curIndex: Int
        do {
            curIndex = nums.indexOf(ori)
            if (curIndex >= 0) {
                ori *= 2
            }
        } while (curIndex >= 0)
        return ori
    }
}

fun main() {
    val obj = KeepMultiplyingFoundValuesByTwo()
    println(obj.findFinalValue(intArrayOf(5, 3, 6, 1, 12), 3))
    println(obj.findFinalValue(intArrayOf(2, 7, 9), 4))
}