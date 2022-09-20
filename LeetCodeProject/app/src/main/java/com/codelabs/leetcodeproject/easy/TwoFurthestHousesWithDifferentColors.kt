package com.codelabs.leetcodeproject.easy

class TwoFurthestHousesWithDifferentColors {
    fun maxDistance(colors: IntArray): Int {
        var startIndex = 0
        var endIndex = colors.lastIndex
        if (colors[startIndex] == colors[endIndex]) {
            while (colors[startIndex] == colors[0] && startIndex != colors.lastIndex) {
                startIndex++
            }
            while (colors[endIndex] == colors[colors.lastIndex] && endIndex != 0) {
                endIndex--
            }
            return if (colors.lastIndex - endIndex > startIndex) {
                colors.lastIndex - startIndex
            } else
                endIndex
        }
        return endIndex - startIndex
    }
}

fun main() {
    val obj = TwoFurthestHousesWithDifferentColors()
    println(obj.maxDistance(intArrayOf(4, 4, 4, 11, 4, 4, 11, 4, 4, 4, 4, 4)))
    println(obj.maxDistance(intArrayOf(1, 1, 1, 6, 1, 1, 1)))
    println(obj.maxDistance(intArrayOf(1, 8, 3, 8, 3)))
    println(obj.maxDistance(intArrayOf(0, 1)))
}