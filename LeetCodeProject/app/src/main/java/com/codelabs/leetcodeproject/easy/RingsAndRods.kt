package com.codelabs.leetcodeproject.easy

class RingsAndRods {
    fun countPoints(rings: String): Int {
        var count = 0
        (0..9).forEach {
            if (rings.contains("R$it") &&
                rings.contains("G$it") &&
                rings.contains("B$it")
            ) {
                count++
            }
        }
        return count
    }
}

fun main() {
    val obj = RingsAndRods()
    println(obj.countPoints("B0B6G0R6R0R6G9"))
    println(obj.countPoints("B0R0G0R9R0B0G0"))
    println(obj.countPoints("G4"))
}