package com.codelabs.leetcodeproject.easy

class FindTheHighestAltitude {
    fun largestAltitude(gain: IntArray): Int {
        var curAltitude = 0
        var highestAltitude = 0
        gain.forEach {
            curAltitude += it
            if (curAltitude > highestAltitude) {
                highestAltitude = curAltitude
            }
        }
        return highestAltitude
    }
}

fun main() {
    val obj = FindTheHighestAltitude()
    println(obj.largestAltitude(intArrayOf(-5, 1, 5, 0, -7)))
    println(obj.largestAltitude(intArrayOf(-4,-3,-2,-1,4,3,2)))
}