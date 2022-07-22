package com.codelabs.leetcodeproject.easy

class FinalValueOfVariableAfterPerformingOperations {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        operations.forEach {
            if (it.contains("++")) {
                x++
            } else {
                x--
            }
        }
        return x
    }
}

fun main() {
    val obj = FinalValueOfVariableAfterPerformingOperations()
    println(obj.finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
    println(obj.finalValueAfterOperations(arrayOf("++X", "++X", "X++")))
    println(obj.finalValueAfterOperations(arrayOf("X++", "++X", "--X", "X--")))
}