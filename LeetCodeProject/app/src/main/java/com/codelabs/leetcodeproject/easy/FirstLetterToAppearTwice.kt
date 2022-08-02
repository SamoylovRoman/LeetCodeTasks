package com.codelabs.leetcodeproject.easy

class FirstLetterToAppearTwice {
    fun repeatedCharacter(s: String): Char {
        val map = mutableMapOf<Char, Boolean>()
        s.forEach {
            if (map[it] != null) {
                return it
            } else {
                map[it] = true
            }
        }
        return ' '
    }
}

fun main() {
    val obj = FirstLetterToAppearTwice()
    println(obj.repeatedCharacter("abccbaacz"))
    println(obj.repeatedCharacter("abcdd"))
}