package com.codelabs.leetcodeproject.easy

import kotlin.math.abs

class CheckWhetherTwoStringsAreAlmostEquivalent {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val map1 = word1.groupBy { it }
        val map2 = word2.groupBy { it }
        ('a'..'z').forEach {
            if (abs((map1[it]?.size ?: 0) - (map2[it]?.size ?: 0)) > 3) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val obj = CheckWhetherTwoStringsAreAlmostEquivalent()
    println(obj.checkAlmostEquivalent("aaaa", "bccb"))
    println(obj.checkAlmostEquivalent("abcdeef", "abaaacc"))
    println(obj.checkAlmostEquivalent("cccddabba", "babababab"))
}