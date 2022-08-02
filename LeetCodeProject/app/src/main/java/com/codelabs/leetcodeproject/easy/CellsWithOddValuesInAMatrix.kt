package com.codelabs.leetcodeproject.easy

class CellsWithOddValuesInAMatrix {
    fun oddCells(m: Int, n: Int, indices: Array<IntArray>): Int {
        val matrix = Array(m) { IntArray(n) { 0 } }
        var count = 0
        indices.forEach { x ->
            for (j in 0 until n) {
                matrix[x[0]][j]++
            }
            for (i in 0 until m) {
                matrix[i][x[1]]++
            }
        }
        matrix.forEach { line ->
            count += line.count { it % 2 != 0 }
        }
        return count
    }
}

fun main() {
    val obj = CellsWithOddValuesInAMatrix()
    println(obj.oddCells(2, 3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))))
    println(obj.oddCells(2, 2, arrayOf(intArrayOf(1, 1), intArrayOf(0, 0))))
}