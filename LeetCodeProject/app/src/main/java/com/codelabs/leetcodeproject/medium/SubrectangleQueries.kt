package com.codelabs.leetcodeproject.medium

class SubrectangleQueries(val rectangle: Array<IntArray>) {
//    private val array = mutableListOf<IntArray>()
//
//    init {
//        rectangle.forEach {
//            array += it
//        }
//    }

    fun printArray() {
        rectangle.forEach { it ->
            it.forEach { print("$it ") }
            println()
        }
    }

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i in row1..row2) {
            for (j in col1..col2) {
                rectangle[i][j] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int) = rectangle[row][col]
}

fun main() {
    val obj1 = SubrectangleQueries(
        arrayOf(
            intArrayOf(1, 2, 1),
            intArrayOf(4, 3, 4),
            intArrayOf(3, 2, 1),
            intArrayOf(1, 1, 1)
        )
    )
    obj1.printArray()
    println(obj1.getValue(0, 2))
    obj1.updateSubrectangle(0, 0, 3, 2, 5)
    obj1.printArray()
    obj1.updateSubrectangle(3, 0, 3, 2, 10)
    obj1.printArray()
}