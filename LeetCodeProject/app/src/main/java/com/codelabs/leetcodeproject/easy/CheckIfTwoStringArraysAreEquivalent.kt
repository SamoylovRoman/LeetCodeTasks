package com.codelabs.leetcodeproject.easy

class CheckIfTwoStringArraysAreEquivalent {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        return word1.joinToString("") == word2.joinToString("")
    }
}

fun main() {
    val obj = CheckIfTwoStringArraysAreEquivalent()
    println(obj.arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
}