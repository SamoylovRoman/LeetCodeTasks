package com.codelabs.leetcodeproject.easy

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
}

fun main() {
    val obj = ValidAnagram()
    println(obj.isAnagram("anagram", "nagaram"))
    println(obj.isAnagram("rat", "car"))
}