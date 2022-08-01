package com.codelabs.leetcodeproject.easy

class FindFirstPalindromicStringInTheArray {
    fun firstPalindrome(words: Array<String>): String {
        return words.firstOrNull {
            it == it.reversed()
        } ?: ""
    }
}

fun main() {
    val obj = FindFirstPalindromicStringInTheArray()
    println(obj.firstPalindrome(arrayOf("abc","car","ada","racecar","cool")))
}