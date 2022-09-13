package com.codelabs.leetcodeproject.easy

class Shift2DGrid {
    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        var tmp: Int
        var tmpNext: Int
        for (i in 0 until k) {
            tmp = grid[grid.lastIndex][grid[0].lastIndex]
            for (j in 0..grid.lastIndex) {
                tmpNext = grid[j][grid[0].lastIndex]
                grid[j][grid[0].lastIndex] = tmp
                tmp = tmpNext
            }
            for (j in grid.indices) {
                tmp = grid[j][grid[0].lastIndex]
                for (x in 0..grid[0].lastIndex) {
                    tmpNext = grid[j][x]
                    grid[j][x] = tmp
                    tmp = tmpNext
                }
            }
        }
        return grid.map { it.toList() }
    }
}

fun main() {
    val obj = Shift2DGrid()
//    obj.shiftGrid(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 1)
//        .forEach { print("$it ") }
//    println()
    obj.shiftGrid(
        arrayOf(
            intArrayOf(3, 8, 1, 9),
            intArrayOf(19, 7, 2, 5),
            intArrayOf(4, 6, 11, 10),
            intArrayOf(12, 0, 21, 13)
        ), 4
    )
        .forEach { println("$it ") }
    println()
    obj.shiftGrid(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 9)
        .forEach { print("$it ") }
    println()
}