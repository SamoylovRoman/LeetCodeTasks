package com.codelabs.leetcodeproject.easy

import kotlin.math.floor
import kotlin.math.log
import kotlin.math.truncate

class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 0) return false
        var answer = n
        while (answer != 1) {
            if (answer % 2 == 0) answer /= 2
            else return false
        }
        val v = log(n.toDouble(), 2.0)
//        return floor(v) == v
        return n > 0 && Integer.bitCount(n) == 1
    }
}

fun main() {
    val obj = PowerOfTwo()
    println(obj.isPowerOfTwo(536870912))
/*    println(obj.isPowerOfTwo(16))
    println(obj.isPowerOfTwo(3))
    println(obj.isPowerOfTwo(0))*/
}