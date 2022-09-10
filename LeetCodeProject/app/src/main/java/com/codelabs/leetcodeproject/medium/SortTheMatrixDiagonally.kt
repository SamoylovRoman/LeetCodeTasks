package com.codelabs.leetcodeproject.medium

class SortTheMatrixDiagonally {
    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        val map = mutableMapOf<Int, MutableList<Int>>()
        for (i in mat.indices) {
            for (j in 0 until mat[0].size) {
                val x = i - j
                if (map[x] != null) {
                    map[x]?.add(mat[i][j])
                } else {
                    map[x] = mutableListOf(mat[i][j])
                }
            }
        }
        map.forEach {
            it.value.sortBy { x -> x }
        }
//        map.forEach { entry ->
//            print("${entry.key}: ")
//            entry.value.forEach { print("$it ") }
//            println()
//        }
        val arr = Array(mat.size) { IntArray(mat[0].size) { 0 } }
        for (i in arr.indices) {
            for (j in 0 until arr[0].size) {
                arr[i][j] = map[i - j]?.get(0)!!
                map[i - j]?.removeAt(0)
            }
        }
        return arr
    }
}

fun main() {
    val obj = SortTheMatrixDiagonally()
    obj.diagonalSort(
        arrayOf(
            intArrayOf(3, 3, 1, 1),
            intArrayOf(2, 2, 1, 2),
            intArrayOf(1, 1, 1, 2)
        )
    ).forEach {
        it.forEach { x ->
            print("$x ")
        }
        println()
    }
    println()
    obj.diagonalSort(
        arrayOf(
            intArrayOf(11, 25, 66, 1, 69, 7),
            intArrayOf(23, 55, 17, 45, 15, 52),
            intArrayOf(75, 31, 36, 44, 58, 8),
            intArrayOf(22, 27, 33, 25, 68, 4),
            intArrayOf(84, 28, 14, 11, 5, 50)
        )
    ).forEach {
        it.forEach { x ->
            print("$x ")
        }
        println()
    }
}