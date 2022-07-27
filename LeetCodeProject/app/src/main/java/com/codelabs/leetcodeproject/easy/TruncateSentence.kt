package com.codelabs.leetcodeproject.easy

class TruncateSentence {
    fun truncateSentence(s: String, k: Int): String {
        var count = k
        var index = 0
        while (count != 0 && index < s.length) {
            if (s[index] == ' ') {
                count--
            }
            index++
        }
        if (index == s.length) {
            return s
        }
        return s.substring(0, index - 1)
    }
}

fun main() {
    val obj = TruncateSentence()
    println(obj.truncateSentence("Hello how are you Contestant", 4))
    println(obj.truncateSentence("chopper is not a tanuki", 5))
}