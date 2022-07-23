package com.codelabs.leetcodeproject.easy

class KidsWithTheGreatestNumberOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var maxCandies = 0
        candies.forEach {
            if (it > maxCandies) maxCandies = it
        }
        return candies.map {
            it + extraCandies >= maxCandies
        }
    }
}

fun main() {
    val obj = KidsWithTheGreatestNumberOfCandies()
    obj.kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3).forEach {
        print("$it ")
    }
    println()
    obj.kidsWithCandies(intArrayOf(4, 2, 1, 1, 2), 1).forEach {
        print("$it ")
    }
}