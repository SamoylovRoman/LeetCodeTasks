package com.codelabs.leetcodeproject.easy

import kotlin.math.pow

class CheckIfWordEqualsSummationOfTwoWords {
    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        return firstWord.convertToInt() + secondWord.convertToInt() == targetWord.convertToInt()
    }

    private fun String.convertToInt(): Int {
        var number = 0
        for ((dec, i) in (this.length - 1 downTo 0).withIndex()) {
            number += (this[i].toInt() - 97) * 10.0.pow(dec.toDouble()).toInt()
        }
        return number
    }
}

fun main() {
    val obj = CheckIfWordEqualsSummationOfTwoWords()
    println(obj.isSumEqual("acb", "cba", "cdb"))
    println(obj.isSumEqual("aaa", "a", "aab"))
}