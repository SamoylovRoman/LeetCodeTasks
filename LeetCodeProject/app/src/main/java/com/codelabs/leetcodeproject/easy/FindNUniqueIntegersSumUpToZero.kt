package com.codelabs.leetcodeproject.easy

class FindNUniqueIntegersSumUpToZero {
    fun sumZero(n: Int): IntArray {
        val arr = IntArray(n) { 0 }
        var startIndex = 0
        var endIndex = n - 1
        var num = 1
        while (startIndex < endIndex) {
            arr[startIndex] = -num
            arr[endIndex] = num
            num++
            startIndex++
            endIndex--
        }
        return arr
    }
}

fun main() {
    val obj = FindNUniqueIntegersSumUpToZero()
    obj.sumZero(5).forEach { print("$it ") }
    println()
    obj.sumZero(3).forEach { print("$it ") }
    println()
    obj.sumZero(1).forEach { print("$it ") }
    println()
}