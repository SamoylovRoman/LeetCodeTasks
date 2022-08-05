package com.codelabs.leetcodeproject.easy

class FindTargetIndicesAfterSortingArray {
    fun targetIndices2(nums: IntArray, target: Int): List<Int> {
        val list = mutableListOf<Int>()
        nums.sorted().forEachIndexed { index, i ->
            if (i == target) {
                list += index
            }
        }
        return list
    }

    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        return nums.sorted().withIndex()
            .filter { it.value == target }
            .map { it.index }
    }
}

fun main() {
    val obj = FindTargetIndicesAfterSortingArray()
    obj.targetIndices(intArrayOf(1, 2, 5, 2, 3), 2).forEach { print("$it ") }
    println()
    obj.targetIndices(intArrayOf(1, 2, 5, 2, 3), 3).forEach { print("$it ") }
    println()
    obj.targetIndices(intArrayOf(1, 2, 5, 2, 3), 5).forEach { print("$it ") }
    println()
}