package com.codelabs.leetcodeproject.easy

class RemovePalindromicSubsequences {
    fun removePalindromeSub(s: String): Int {
        var startIndex = 0
        var endIndex = s.length - 1
        while (startIndex < endIndex) {
            if (s[startIndex++] != s[endIndex--]) {
                return 2
            }
        }
        return 1
    }
}

fun main() {
    val obj = RemovePalindromicSubsequences()
    println(obj.removePalindromeSub("ababa"))
    println(obj.removePalindromeSub("abb"))
    println(obj.removePalindromeSub("baabb"))
}