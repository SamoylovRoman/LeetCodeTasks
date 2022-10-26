package com.codelabs.leetcodeproject.easy

class CheckIfNumbersAreAscendingInASentence {
    fun areNumbersAscending(s: String): Boolean {
        var number = 0
        s.split(" ").forEach { token ->
            if (token[0].isDigit()) {
                if (token.toInt() > number) {
                    number = token.toInt()
                } else {
                    return false
                }
            }
        }
        return true
    }
}

fun main() {
    val obj = CheckIfNumbersAreAscendingInASentence()
    println(obj.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"))
    println(obj.areNumbersAscending("hello world 5 x 5"))
    println(obj.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"))
}