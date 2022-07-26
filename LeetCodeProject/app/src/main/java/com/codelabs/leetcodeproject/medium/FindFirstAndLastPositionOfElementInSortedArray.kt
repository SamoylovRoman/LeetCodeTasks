package com.codelabs.leetcodeproject.medium

class FindFirstAndLastPositionOfElementInSortedArray {
    fun searchRange(nums: IntArray, target: Int): IntArray {
//        return intArrayOf(nums.indexOfFirst { it == target }, nums.indexOfLast { it == target })
        val newArray = intArrayOf(-1, -1)
        nums.forEachIndexed { index, i ->
            if (i == target) {
                if (newArray[0] != -1) {
                    newArray[1] = index
                } else {
                    newArray[0] = index
                    newArray[1] = index
                }
            }
        }
        return newArray
    }
}

fun main() {
    val obj = FindFirstAndLastPositionOfElementInSortedArray()
    obj.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).forEach { print("$it ") }
    println()
    obj.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).forEach { print("$it ") }
}