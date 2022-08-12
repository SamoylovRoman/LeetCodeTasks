package com.codelabs.leetcodeproject.easy

class HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        val expectedOrder = heights.sorted()
        var count = 0
        heights.forEachIndexed { index, i ->
            if (i != expectedOrder[index]) count++
        }
        return count
    }
}

fun main() {
    val obj = HeightChecker()
    println(obj.heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
    println(obj.heightChecker(intArrayOf(5, 1, 2, 3, 4)))
    println(obj.heightChecker(intArrayOf(1, 2, 3, 4, 5)))
}