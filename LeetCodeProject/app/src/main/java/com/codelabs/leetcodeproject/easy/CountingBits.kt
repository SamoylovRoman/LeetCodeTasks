package com.codelabs.leetcodeproject.easy

class CountingBits {
    fun countBits(n: Int): IntArray {
        val arr = IntArray(n + 1) { 0 }
        (0..n).forEach {
            arr[it] = it % 2 + arr[it / 2]
        }
        return arr
    }
}

fun main() {
    val obj = CountingBits()
    obj.countBits(2).forEach { print("$it ") }
    println()
    obj.countBits(5).forEach { print("$it ") }
    println()
}