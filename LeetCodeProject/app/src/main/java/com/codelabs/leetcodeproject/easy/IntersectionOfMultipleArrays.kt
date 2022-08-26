package com.codelabs.leetcodeproject.easy

class IntersectionOfMultipleArrays {
    fun intersection(nums: Array<IntArray>): List<Int> {
        val map = mutableMapOf<Int, Int>()
        nums.forEach { arr ->
            arr.forEach {
                if (map[it] != null) map[it] = map[it]!! + 1
                else map[it] = 1
            }
        }
        val list = mutableListOf<Int>()
        map.forEach {
            if (it.value == nums.size) list += it.key
        }
        list.sort()
        return list
    }
}

fun main() {
    val obj = IntersectionOfMultipleArrays()
    obj.intersection(
        arrayOf(
            intArrayOf(3, 1, 2, 4, 5),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(3, 4, 5, 6)
        )
    ).forEach { print("$it ") }
    println()
    obj.intersection(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6)
        )
    ).forEach { print("$it ") }
    println()
}