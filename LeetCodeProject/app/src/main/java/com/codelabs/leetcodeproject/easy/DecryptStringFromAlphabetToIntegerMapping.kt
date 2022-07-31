package com.codelabs.leetcodeproject.easy

class DecryptStringFromAlphabetToIntegerMapping {
    fun freqAlphabets(s: String): String {
        var str = ""
        var index = s.length - 1
        while (index != -1) {
            if (s[index] == '#') {
                str += ("${s[index - 2]}${s[index - 1]}".toInt() + 96).toChar()
                index -= 3
            } else {
                str += ("${s[index]}".toInt() + 96).toChar()
                index--
            }
        }
        return str.reversed()
    }
}

fun main() {
    val obj = DecryptStringFromAlphabetToIntegerMapping()
    println(obj.freqAlphabets("10#11#12"))
    println()
    println(obj.freqAlphabets("1326#"))
}