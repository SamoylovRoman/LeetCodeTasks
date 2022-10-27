package com.codelabs.leetcodeproject.easy

class SpecialPositionsInABinaryMatrix {
    fun numSpecial(mat: Array<IntArray>): Int {
        var count = 0
        mat.forEach { arr ->
            if (arr.count { it == 1 } == 1) {
                val index = arr.indexOf(1)
                var zeroCount = 0
                for (i in mat.indices) {
                    if (mat[i][index] == 0) {
                        zeroCount++
                    }
                }
                if (zeroCount == mat.size - 1) {
                    count++
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = SpecialPositionsInABinaryMatrix()
    println(obj.numSpecial(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0, 0))))
    println(obj.numSpecial(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))))
}