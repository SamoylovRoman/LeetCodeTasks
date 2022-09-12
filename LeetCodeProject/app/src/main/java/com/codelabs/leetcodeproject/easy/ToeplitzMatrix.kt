package com.codelabs.leetcodeproject.easy

class ToeplitzMatrix {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        if (matrix.size == 1 || matrix[0].size == 1) return true
        for (i in matrix.size - 1 downTo 1) {
            for (j in 1 until matrix[0].size) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) return false
            }
        }
        return true
    }
}

fun main() {
    val obj = ToeplitzMatrix()
    println(
        obj.isToeplitzMatrix(
            arrayOf(
                intArrayOf(97, 97),
                intArrayOf(80, 6),
                intArrayOf(10, 79)
            )
        )
    )
    println(obj.isToeplitzMatrix(arrayOf(intArrayOf(11, 74, 0, 93), intArrayOf(40, 11, 74, 7))))
    println(
        obj.isToeplitzMatrix(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 1, 2, 3),
                intArrayOf(9, 5, 1, 2)
            )
        )
    )
    println(obj.isToeplitzMatrix(arrayOf(intArrayOf(1, 2), intArrayOf(2, 2))))
}