package com.codelabs.leetcodeproject.easy

class TheKWeakestRowsInAMatrix {
    fun kWeakestRows2(mat: Array<IntArray>, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        mat.forEachIndexed { index, ints ->
            map[index] = ints.count { it == 1 }
        }
        return map.entries.sortedBy { it.value }.map { it.key }.take(k).toIntArray()
    }

    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        return mat
            .map { it.sum() }
            .mapIndexed { index, i -> Pair(i, index) }
            .sortedBy { it.first }
            .map { it.second }
            .take(k)
            .toIntArray()
    }
}

fun main() {
    val obj = TheKWeakestRowsInAMatrix()
    obj.kWeakestRows(
        arrayOf(
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1)
        ), 3
    ).forEach { print("$it ") }
    println()
    obj.kWeakestRows(
        arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 0, 0, 0)
        ), 2
    ).forEach { print("$it ") }
    println()
}