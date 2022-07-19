package com.codelabs.leetcodeproject

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        return s.trim().length - s.trim().lastIndexOf(' ') - 1
    }
}

fun main() {
    val obj = LengthOfLastWord()
    println(obj.lengthOfLastWord("Hello World"))
    println(obj.lengthOfLastWord("   fly me   to   the moon  "))
    println(obj.lengthOfLastWord("luffy is still joyboy"))
}