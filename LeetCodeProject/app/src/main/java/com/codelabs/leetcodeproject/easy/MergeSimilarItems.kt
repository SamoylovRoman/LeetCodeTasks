package com.codelabs.leetcodeproject.easy

class MergeSimilarItems {
    fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
        val map = mutableMapOf<Int, Int>().toSortedMap()
        items1.forEach {
            map[it[0]] = it[1]
        }
        items2.forEach {
            if (map[it[0]] != null) map[it[0]] = map[it[0]]!! + it[1]
            else map[it[0]] = it[1]
        }
        val list = emptyList<List<Int>>().toMutableList()
        map.forEach {
            list += listOf(listOf(it.key, it.value))
        }
        return list
    }
}

fun main() {
    val obj = MergeSimilarItems()
    obj.mergeSimilarItems(
        arrayOf(intArrayOf(1, 1), intArrayOf(4, 5), intArrayOf(3, 8)), arrayOf(
            intArrayOf(3, 1), intArrayOf(1, 5)
        )
    ).forEach { print("$it ") }
    println()
    obj.mergeSimilarItems(
        arrayOf(intArrayOf(1, 1), intArrayOf(3, 2), intArrayOf(2, 3)), arrayOf(
            intArrayOf(2, 1), intArrayOf(3, 2), intArrayOf(1, 3)
        )
    ).forEach { print("$it ") }
    println()
    obj.mergeSimilarItems(
        arrayOf(intArrayOf(1, 3), intArrayOf(2, 2)), arrayOf(
            intArrayOf(7, 1), intArrayOf(2, 2), intArrayOf(1, 4)
        )
    ).forEach { print("$it ") }
    println()
}