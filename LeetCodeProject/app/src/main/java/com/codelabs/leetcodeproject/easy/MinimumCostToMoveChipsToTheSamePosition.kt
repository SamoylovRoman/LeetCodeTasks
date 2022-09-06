package com.codelabs.leetcodeproject.easy

class MinimumCostToMoveChipsToTheSamePosition {
    fun minCostToMoveChips(position: IntArray): Int {
        var even = 0
        var odd = 0
        position.forEach {
            if (it % 2 == 0) {
                even++
            } else {
                odd++
            }
        }
        return minOf(even, odd)
    }
}

fun main() {
    val obj = MinimumCostToMoveChipsToTheSamePosition()
    println(obj.minCostToMoveChips(intArrayOf(1, 2, 3)))
    println(obj.minCostToMoveChips(intArrayOf(2, 2, 2, 3, 3)))
    println(obj.minCostToMoveChips(intArrayOf(1, 1000000000)))
}