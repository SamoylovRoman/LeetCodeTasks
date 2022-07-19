package com.codelabs.leetcodeproject

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        val map = nums.groupBy { it }.toMutableMap()
        map.keys.forEachIndexed { index, i ->
            nums[index] = i
        }
        nums.forEach {
            println(it)
        }
        print("count = ${map.size}")
        return map.size
    }
}

fun main() {
    val obj = RemoveDuplicatesFromSortedArray()
    obj.removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
}