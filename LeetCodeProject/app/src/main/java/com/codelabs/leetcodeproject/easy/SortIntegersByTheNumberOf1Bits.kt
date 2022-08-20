package com.codelabs.leetcodeproject.easy

class SortIntegersByTheNumberOf1Bits {
    fun sortByBits(arr: IntArray) = arr.sortedBy { it }.sortedBy { Integer.bitCount(it) }
}

fun main() {
    val obj = SortIntegersByTheNumberOf1Bits()
    obj.sortByBits(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)).forEach { print("$it ") }
    println()
    obj.sortByBits(intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1))
        .forEach { print("$it ") }
    println()
}