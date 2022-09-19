package com.codelabs.leetcodeproject.easy

class CheckIfMatrixIsXMatrix {
    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        for (i in grid.indices) {
            for (j in 0 until grid[0].size) {
                if (i == j || j == grid.size - i - 1) {
                    if (grid[i][j] == 0) {
                        return false
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false
                    }
                }
            }
        }
        return true
    }
}

fun main() {
    val obj = CheckIfMatrixIsXMatrix()
    println(
        obj.checkXMatrix(
            arrayOf(
                intArrayOf(2, 0, 0, 1),
                intArrayOf(0, 3, 1, 0),
                intArrayOf(0, 5, 2, 0),
                intArrayOf(4, 0, 0, 2)
            )
        )
    )
    println(
        obj.checkXMatrix(
            arrayOf(
                intArrayOf(5, 7, 0),
                intArrayOf(0, 3, 1),
                intArrayOf(0, 5, 0)
            )
        )
    )
}