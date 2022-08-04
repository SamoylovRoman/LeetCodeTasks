package com.codelabs.leetcodeproject.easy

class ReversePrefixOfWord {
    fun reversePrefix(word: String, ch: Char): String {
        var str = ""
        val index = word.indexOfFirst {
            it == ch
        }
        if (index == -1) {
            return word
        }
        str += word.substring(0, index + 1).reversed()
        if (index != word.length) {
            str += word.substring(index + 1, word.length)
        }
        return str
    }
}

fun main() {
    val obj = ReversePrefixOfWord()
    println(obj.reversePrefix("abcdefd", 'd'))
    println(obj.reversePrefix("xyxzxe", 'z'))
    println(obj.reversePrefix("abcd", 'z'))
}