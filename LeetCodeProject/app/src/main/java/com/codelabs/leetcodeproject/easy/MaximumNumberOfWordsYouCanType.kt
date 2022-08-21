package com.codelabs.leetcodeproject.easy

class MaximumNumberOfWordsYouCanType {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        var count = 0
        text.split(' ').forEach { str ->
            for (i in brokenLetters.indices) {
                if (str.contains(brokenLetters[i])) return@forEach
            }
            count++
        }
        return count
    }
}

fun main() {
    val obj = MaximumNumberOfWordsYouCanType()
    println(obj.canBeTypedWords("hello world", "ad"))
    println(obj.canBeTypedWords("leet code", "lt"))
    println(obj.canBeTypedWords("leet code", "e"))
}