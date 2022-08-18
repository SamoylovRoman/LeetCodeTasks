package com.codelabs.leetcodeproject.medium

class ReduceArraySizeToTheHalf {
    fun minSetSize(arr: IntArray): Int {
        val list = arr.groupBy { it }.values.sortedBy { it.size }.reversed()
        var count = 0
        var countDigits = 0
        list.forEach {
            countDigits += it.size
            count++
            if (countDigits >= arr.size / 2) {
                return count
            }
        }
        return count
    }
}

fun main() {
    val obj = ReduceArraySizeToTheHalf()
    println(obj.minSetSize(intArrayOf(3, 3, 3, 3, 5, 5, 5, 2, 2, 7)))
    println(obj.minSetSize(intArrayOf(7, 7, 7, 7, 7, 7)))
}