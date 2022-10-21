package com.codelabs.leetcodeproject.easy

class NumberOfLinesToWriteString {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        val result = intArrayOf(1, 0)
        s.forEach { c ->
            if (result[1] + widths[c - 'a'] <= 100) {
                result[1] += widths[c - 'a']
            } else {
                result[0]++
                result[1] = widths[c - 'a']
            }
        }
        return result
    }
}

fun main() {
    val obj = NumberOfLinesToWriteString()
    obj.numberOfLines(
        intArrayOf(
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10
        ), "abcdefghijklmnopqrstuvwxyz"
    ).forEach { print("$it ") }
    println()
    obj.numberOfLines(
        intArrayOf(
            4,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10
        ), "bbbcccdddaaa"
    ).forEach { print("$it ") }
    println()
}