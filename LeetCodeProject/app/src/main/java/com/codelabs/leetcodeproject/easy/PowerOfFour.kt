package com.codelabs.leetcodeproject.easy

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log

class PowerOfFour {
    fun isPowerOfFour2(n: Int): Boolean {
        if (n == 0) return false
        var answer = n
        while (answer != 1) {
            if (answer % 4 == 0) answer /= 4
            else return false
        }
        return true
    }

    fun isPowerOfFour(n: Int): Boolean {
        if (n == 0) return false
        val log = log(n.toDouble(), 4.toDouble())
        return ceil(log) == floor(log)
    }
}

fun main() {
    val obj = PowerOfFour()
    println(obj.isPowerOfFour(16))
    println(obj.isPowerOfFour(5))
    println(obj.isPowerOfFour(1))
}