package com.codelabs.leetcodeproject.easy

class RelativeSortArray {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val list = mutableListOf<Int>()
        arr2.forEach { value ->
            for (i in 0 until arr1.count { it == value }) list += value
        }
        list += (arr1.toList() - arr2.toSet()).sorted()
        return list.toIntArray()
    }
}

fun main() {
    val obj = RelativeSortArray()
    obj.relativeSortArray(
        intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19),
        intArrayOf(2, 1, 4, 3, 9, 6)
    ).forEach { print("$it ") }
    println()
    obj.relativeSortArray(intArrayOf(28, 6, 22, 8, 44, 17), intArrayOf(22, 28, 8, 6))
        .forEach { print("$it ") }
    println()
}