package com.codelabs.leetcodeproject.easy

class PercentageOfLetterInString {
    fun percentageLetter(s: String, letter: Char): Int {
        return s.count { it == letter } * 100 / s.length
    }
}

fun main() {
    val obj = PercentageOfLetterInString()
    println(obj.percentageLetter("foobar", 'o'))
    println(obj.percentageLetter("jjjj", 'k'))
}