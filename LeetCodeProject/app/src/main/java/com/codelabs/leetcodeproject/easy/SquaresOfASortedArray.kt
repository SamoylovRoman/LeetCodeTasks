package com.codelabs.leetcodeproject.easy

class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map { it * it }.sorted().toIntArray()
    }
}

fun main() {
    val obj = SquaresOfASortedArray()
    obj.sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).forEach { print("$it ") }
    println()
    obj.sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).forEach { print("$it ") }
    println()
}