package com.codelabs.leetcodeproject.easy

class MatrixDiagonalSum {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var i = 0
        var j = mat.size - 1
        var sum = 0
        while (i != mat.size) {
            sum += mat[i][i]
            if (i != j) {
                sum += mat[i][j]
            }
            i++
            j--
        }
        return sum
    }
}

fun main() {
    val obj = MatrixDiagonalSum()
    println(obj.diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
}