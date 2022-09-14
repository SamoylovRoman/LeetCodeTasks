package com.codelabs.leetcodeproject.easy

import kotlin.math.sqrt

class CountSquareSumTriples {
    fun countTriples(n: Int): Int {
        var count = 0
        var x: Float
        for (i in 1..n) {
            for (j in 1..n) {
                x = sqrt((i * i + j * j).toFloat())
                if (x % 1 == 0f && x <= n) {
                    count++
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = CountSquareSumTriples()
    println(obj.countTriples(5))
    println(obj.countTriples(10))
}