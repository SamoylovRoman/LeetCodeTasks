package com.codelabs.leetcodeproject.medium

class PartitionArrayAccordingToGivenPivot {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        return (nums.filter { it < pivot } + nums.filter { it == pivot } + nums.filter { it > pivot }).toIntArray()
    }
}

fun main() {
    val obj = PartitionArrayAccordingToGivenPivot()
    obj.pivotArray(intArrayOf(9, 12, 5, 10, 14, 3, 10), 10).forEach { print("$it ") }
    println()
    obj.pivotArray(intArrayOf(-3, 4, 3, 2), 2).forEach { print("$it ") }
    println()
}