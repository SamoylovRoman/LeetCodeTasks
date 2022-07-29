package com.codelabs.leetcodeproject.easy

class ReverseWordsInAString3 {
    fun reverseWords(s: String): String {
        return s.split(" ").joinToString(" ") {
            it.reversed()
        }
//        return str
    }
}

fun main() {
    val obj = ReverseWordsInAString3()
    println(obj.reverseWords("Let's take LeetCode contest"))
}