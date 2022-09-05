package com.codelabs.leetcodeproject.easy

class RankTransformOfAnArray {
    fun arrayRankTransform(arr: IntArray): IntArray {
        val list = arr.toSortedSet()
        val map = mutableMapOf<Int, Int>()
        list.forEachIndexed { index, i ->
            map[i] = index + 1
        }
        for (i in arr.indices) {
            arr[i] = map[arr[i]]!!
        }
        return arr
    }
}

fun main() {
    val obj = RankTransformOfAnArray()
//    obj.arrayRankTransform(intArrayOf(40, 10, 20, 30)).forEach { print("$it ") }
//    println()
//    obj.arrayRankTransform(intArrayOf(100, 100, 100)).forEach { print("$it ") }
//    println()
    obj.arrayRankTransform(intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12)).forEach { print("$it ") }
    println()
}