package com.codelabs.leetcodeproject.easy

class CountingWordsWithAGivenPrefix {
    fun prefixCount(words: Array<String>, pref: String): Int {
        return words.count {
            it.startsWith(pref)
        }
    }
}

fun main() {
    val obj = CountingWordsWithAGivenPrefix()
    println(obj.prefixCount(arrayOf("pay", "attention", "practice", "attend"), "at"))
    println(obj.prefixCount(arrayOf("leetcode", "win", "loops", "success"), "code"))
}