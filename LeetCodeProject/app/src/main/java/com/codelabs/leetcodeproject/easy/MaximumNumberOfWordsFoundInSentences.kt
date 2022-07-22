package com.codelabs.leetcodeproject.easy

import java.lang.Math.max

class MaximumNumberOfWordsFoundInSentences {
    fun mostWordsFound(sentences: Array<String>): Int {
        var maxWords = 0
        sentences.forEach {
            maxWords = max(it.split(' ').size, maxWords)
        }
        return maxWords
    }
}

fun main() {
    val obj = MaximumNumberOfWordsFoundInSentences()
    println(
        obj.mostWordsFound(
            arrayOf(
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
            )
        )
    )
    println(
        obj.mostWordsFound(
            arrayOf(
                "please wait", "continue to fight", "continue to win"
            )
        )
    )
}