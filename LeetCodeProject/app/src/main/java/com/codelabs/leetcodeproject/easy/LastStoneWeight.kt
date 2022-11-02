package com.codelabs.leetcodeproject.easy

class LastStoneWeight {
    fun lastStoneWeight(stones: IntArray): Int {
        val list = stones.toMutableList()
        while (list.size > 1) {
            list.sortDescending()
            if (list[0] == list[1]) {
                list.removeAt(0)
                list.removeAt(0)
            } else {
                list[0] = list[0] - list[1]
                list.removeAt(1)
            }
        }
        return if (list.isEmpty()) 0 else list[0]
    }
}

fun main() {
    val obj = LastStoneWeight()
    println(obj.lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
    println(obj.lastStoneWeight(intArrayOf(1)))
}