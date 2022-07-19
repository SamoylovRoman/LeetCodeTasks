package com.codelabs.leetcodeproject

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index, i ->
            if (target <= i) return index
        }
        return nums.size
    }
}

fun main() {
    val obj = SearchInsertPosition()
    println(obj.searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(obj.searchInsert(intArrayOf(1, 3, 5, 6), 2))
    println(obj.searchInsert(intArrayOf(1, 3, 5, 6), 7))
}