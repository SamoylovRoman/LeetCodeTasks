package com.codelabs.leetcodeproject.easy

class PowerOfThree {
    fun isPowerOfThree(n: Int): Boolean {
        if (n == 0) return false
        var answer = n
        while (answer != 1) {
            if (answer % 3 == 0) answer /= 3
            else return false
        }
        return true
    }
}

fun main() {
    val obj = PowerOfThree()
    println(obj.isPowerOfThree(27))
    println(obj.isPowerOfThree(0))
    println(obj.isPowerOfThree(9))
}