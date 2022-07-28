package com.codelabs.leetcodeproject.easy

class CountTheNumberOfConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var count = 0
        words.forEach { str ->
            var isAllowed = true
            str.forEach { ch ->
                if (!allowed.contains(ch)) {
                    isAllowed = false
                    return@forEach
                }
            }
            if (isAllowed) {
                count++
            }
        }
        return count
    }
}

fun main() {
    val obj = CountTheNumberOfConsistentStrings()
//    println(obj.countConsistentStrings("ab", arrayOf("ad", "bd", "aaab", "baa", "badab")))
//    println(obj.countConsistentStrings("abc", arrayOf("a", "b", "c", "ab", "ac", "bc", "abc")))
    println(
        obj.countConsistentStrings(
            "cad",
            arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d")
        )
    )
}