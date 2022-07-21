package com.codelabs.leetcodeproject

class ConcatenationOfArray {
    fun getConcatenation(nums: IntArray): IntArray {
        return nums + nums
    }
}

fun main() {
    val obj = ConcatenationOfArray()
    obj.getConcatenation(intArrayOf(1, 2, 1)).forEach {
        print("$it ")
    }
    println()
    obj.getConcatenation(intArrayOf(1, 3, 2, 1)).forEach {
        print("$it ")
    }
    println()
}