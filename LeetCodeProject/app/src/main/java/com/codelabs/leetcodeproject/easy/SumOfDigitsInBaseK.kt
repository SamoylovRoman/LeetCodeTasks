package com.codelabs.leetcodeproject.easy

class SumOfDigitsInBaseK {
    fun sumBase(n: Int, k: Int): Int {
        var num = n
        var numInKSum = 0
        while (num > 0) {
            numInKSum += num % k
            num /= k
        }
        return numInKSum
    }
}

fun main() {
    val obj = SumOfDigitsInBaseK()
    println(obj.sumBase(34, 6))
    println(obj.sumBase(10, 10))
}