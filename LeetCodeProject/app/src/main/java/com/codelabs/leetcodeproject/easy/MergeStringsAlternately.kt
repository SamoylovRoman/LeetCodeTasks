package com.codelabs.leetcodeproject.easy

class MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        var index1 = 0
        var index2 = 0
        var str = ""
        while (index1 < word1.length || index2 < word2.length) {
            if (index1 < word1.length) str += word1[index1++]
            if (index2 < word2.length) str += word2[index2++]
        }
        return str
    }
}

fun main() {
    val obj = MergeStringsAlternately()
    println(obj.mergeAlternately("abc", "pqr"))
    println(obj.mergeAlternately("ab", "pqrs"))
    println(obj.mergeAlternately("abcd", "pq"))
}