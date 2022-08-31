package com.codelabs.leetcodeproject.easy

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map {
            when {
                it % 15 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }
    }
}

fun main() {
    val obj = FizzBuzz()
    obj.fizzBuzz(3).forEach { print("$it ") }
    println()
    obj.fizzBuzz(5).forEach { print("$it ") }
    println()
    obj.fizzBuzz(15).forEach { print("$it ") }
    println()
}