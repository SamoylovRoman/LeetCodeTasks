package com.codelabs.leetcodeproject.easy

class UniqueNumberOfOccurrences {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val occurrences = arr.groupBy { it }.values.map { it.size }
        return occurrences.size == occurrences.distinct().size
    }
}

fun main() {
    val obj = UniqueNumberOfOccurrences()
    println(obj.uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)))
    println(obj.uniqueOccurrences(intArrayOf(1, 2)))
    println(obj.uniqueOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)))
}