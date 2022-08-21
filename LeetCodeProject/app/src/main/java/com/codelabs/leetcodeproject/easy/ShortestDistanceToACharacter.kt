package com.codelabs.leetcodeproject.easy

import java.lang.Math.abs

class ShortestDistanceToACharacter {
    fun shortestToChar(s: String, c: Char): IntArray {
        val listC = mutableListOf<Int>()
        s.forEachIndexed { index, ch -> if (ch == c) listC.add(index) }
        val arr = IntArray(s.length) { 0 }
        s.forEachIndexed { index, ch ->
            if (ch != c) {
                var dif = 4000
                for (i in 0 until listC.size) {
                    if (abs(listC[i] - index) < dif) {
                        dif = abs(listC[i] - index)
                    }
                }
                arr[index] = dif
            } else {
                arr[index] = 0
            }
        }
        return arr
    }
}

fun main() {
    val obj = ShortestDistanceToACharacter()
    obj.shortestToChar("loveleetcode", 'e').forEach { print("$it ") }
    println()
    obj.shortestToChar("aaab", 'b').forEach { print("$it ") }
    println()
}