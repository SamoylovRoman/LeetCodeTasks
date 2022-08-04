package com.codelabs.leetcodeproject.easy

class DetermineColorOfAChessboardSquare {
    fun squareIsWhite(coordinates: String): Boolean {
        return (coordinates[0].toInt() + coordinates[1].toInt()) % 2 != 0
    }
}

fun main() {
    val obj = DetermineColorOfAChessboardSquare()
    println(obj.squareIsWhite("a1"))
    println(obj.squareIsWhite("h3"))
    println(obj.squareIsWhite("c7"))
}