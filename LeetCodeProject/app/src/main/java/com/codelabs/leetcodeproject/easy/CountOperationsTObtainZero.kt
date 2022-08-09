package com.codelabs.leetcodeproject.easy

class CountOperationsTObtainZero {
    fun countOperations(num1: Int, num2: Int): Int {
        var count = 0
        var n1 = num1
        var n2 = num2
        while (n1 > 0 && n2 > 0) {
            if (n1 >= n2) {
                n1 -= n2
            } else {
                n2 -= n1
            }
            count++
        }
        return count
    }
}

fun main() {
    val obj = CountOperationsTObtainZero()
    println(obj.countOperations(2, 3))
    println(obj.countOperations(10, 10))
}