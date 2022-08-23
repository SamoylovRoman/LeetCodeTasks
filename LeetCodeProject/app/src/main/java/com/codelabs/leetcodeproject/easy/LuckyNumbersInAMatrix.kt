package com.codelabs.leetcodeproject.easy

import java.util.Collections.min
import kotlin.math.min


class LuckyNumbersInAMatrix {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val minInRows = mutableListOf<Int>()
        matrix.forEach { arr ->
            var min = arr[0]
            for (i in arr.indices) {
                if (arr[i] < min) min = arr[i]
            }
            minInRows.add(min)
        }
        if (minInRows.size == 1) return minInRows
        val maxInColumns = mutableListOf<Int>()
        for (i in 0 until matrix[0].size) {
            var max = matrix[0][i]
            for (j in matrix.indices) {
                if (matrix[j][i] > max) max = matrix[j][i]
            }
            maxInColumns.add(max)
        }
        return minInRows.filter { maxInColumns.contains(it) }
    }
}

fun main() {
    val obj = LuckyNumbersInAMatrix()
    obj.luckyNumbers(arrayOf(intArrayOf(3, 7, 8), intArrayOf(9, 11, 13), intArrayOf(15, 16, 17)))
        .forEach { print("$it ") }
    println()
    obj.luckyNumbers(
        arrayOf(
            intArrayOf(1, 10, 4, 2),
            intArrayOf(9, 3, 8, 7),
            intArrayOf(15, 16, 17, 12)
        )
    )
        .forEach { print("$it ") }
    println()
}