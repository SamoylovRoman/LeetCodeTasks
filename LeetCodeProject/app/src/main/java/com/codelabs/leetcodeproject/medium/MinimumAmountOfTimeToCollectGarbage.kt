package com.codelabs.leetcodeproject.medium

class MinimumAmountOfTimeToCollectGarbage {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        var travelTime = 0
        "MPG".forEach { ch ->
            for (i in 0 until garbage.indexOfLast { it.contains(ch) })
                travelTime += travel[i]
        }
        return travelTime + garbage.joinToString("").length
    }
}

fun main() {
    val obj = MinimumAmountOfTimeToCollectGarbage()
    println(obj.garbageCollection(arrayOf("G", "P", "GP", "GG"), intArrayOf(2, 4, 3)))
    println(obj.garbageCollection(arrayOf("MMM", "PGM", "GP"), intArrayOf(3, 10)))
}