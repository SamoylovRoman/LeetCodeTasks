package com.codelabs.leetcodeproject.easy

class MakeTwoArraysEqualByReversingSubArrays {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        return target.sorted() == arr.sorted()
    }
}

fun main() {
    val obj = MakeTwoArraysEqualByReversingSubArrays()
    println(obj.canBeEqual(intArrayOf(1, 2, 3, 4), intArrayOf(2, 4, 1, 3)))
    println(obj.canBeEqual(intArrayOf(7), intArrayOf(7)))
    println(obj.canBeEqual(intArrayOf(3, 7, 9), intArrayOf(3, 7, 11)))
}