package com.codelabs.leetcodeproject.medium

class StoneGameVI {
    fun stoneGameVI(aliceValues: IntArray, bobValues: IntArray): Int {
        val maximumsList = aliceValues.mapIndexed { index, i -> i + bobValues[index] }
        val map = mutableMapOf<Int, Int>()
        maximumsList.forEachIndexed { index, i -> map[index] = i }
        var sumAlice = 0
        var sumBob = 0
        map.entries.sortedByDescending { it.value }.forEachIndexed { index, mutableEntry ->
            if (index % 2 == 0) {
                sumAlice += aliceValues[mutableEntry.key]
            } else {
                sumBob += bobValues[mutableEntry.key]
            }
        }
        return when {
            sumAlice > sumBob -> 1
            sumAlice < sumBob -> -1
            else -> 0
        }
    }
}

fun main() {
    val obj = StoneGameVI()
    println(obj.stoneGameVI(intArrayOf(1, 3), intArrayOf(2, 1)))
    println(obj.stoneGameVI(intArrayOf(1, 2), intArrayOf(3, 1)))
    println(obj.stoneGameVI(intArrayOf(2, 4, 3), intArrayOf(1, 6, 7)))
}