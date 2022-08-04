package com.codelabs.leetcodeproject.easy

class MaximumNumberOfPairsInArray {
    fun numberOfPairs(nums: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()
        var pairsCount = 0
        var leftover = 0
        nums.forEach {
            map[it] = map[it]?.plus(1) ?: 1
        }
        map.forEach {
            pairsCount += it.value / 2
            leftover += it.value % 2
        }
        return intArrayOf(pairsCount, leftover)
    }
}

fun main() {
    val obj = MaximumNumberOfPairsInArray()
    obj.numberOfPairs(intArrayOf(1, 3, 2, 1, 3, 2, 2)).forEach { print("$it ") }
    println()
    obj.numberOfPairs(intArrayOf(1, 1)).forEach { print("$it ") }
    println()
    obj.numberOfPairs(intArrayOf(0)).forEach { print("$it ") }
    println()
}