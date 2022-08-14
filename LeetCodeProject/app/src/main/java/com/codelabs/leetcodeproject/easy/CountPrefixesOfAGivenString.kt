package com.codelabs.leetcodeproject.easy

class CountPrefixesOfAGivenString {
    fun countPrefixes(words: Array<String>, s: String): Int {
        return words.count { s.startsWith(it) }
    }
}

fun main() {
    val obj = CountPrefixesOfAGivenString()
    println(obj.countPrefixes(arrayOf("a", "b", "c", "ab", "bc", "abc"), "abc"))
    println(obj.countPrefixes(arrayOf("a", "a"), "aa"))
}