package com.codelabs.leetcodeproject.easy

class NumberOfStepsToReduceANumberToZero {
    fun numberOfSteps(num: Int): Int {
        var newNum = num
        var steps = 0
        while (newNum != 0) {
            if (newNum % 2 == 0) {
                newNum /= 2
            } else {
                newNum--
            }
            steps++
        }
        return steps
    }
}

fun main() {
    val obj = NumberOfStepsToReduceANumberToZero()
    println(obj.numberOfSteps(14))
    println(obj.numberOfSteps(8))
    println(obj.numberOfSteps(123))
}