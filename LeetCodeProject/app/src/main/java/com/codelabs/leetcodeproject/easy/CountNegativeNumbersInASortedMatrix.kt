package com.codelabs.leetcodeproject.easy

class CountNegativeNumbersInASortedMatrix {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for (i in grid.size - 1 downTo 0) {
            for (j in grid[0].size - 1 downTo 0) {
                if (grid[i][j] < 0) count++
                else break
            }
        }
        return count
    }
}

fun main() {
    val obj = CountNegativeNumbersInASortedMatrix()
    println(
        obj.countNegatives(
            arrayOf(
                intArrayOf(4, 3, 2, -1),
                intArrayOf(3, 2, 1, -1),
                intArrayOf(1, 1, -1, -2),
                intArrayOf(-1, -1, -2, -3)
            )
        )
    )
    println(
        obj.countNegatives(
            arrayOf(
                intArrayOf(3, 2),
                intArrayOf(1, 0)
            )
        )
    )
}