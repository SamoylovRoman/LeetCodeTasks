package com.codelabs.leetcodeproject.easy

class ReplaceAllDigitsWithCharacters {
    fun replaceDigits(s: String): String {
        var str = ""
        s.forEachIndexed { index, c ->
            str += if (index % 2 == 0) {
                c
            } else {
                (s[index - 1] + c.toInt() - 48)
            }
        }
        return str
    }
}

fun main() {
    val obj = ReplaceAllDigitsWithCharacters()
    println(obj.replaceDigits("a1c1e1"))
    println(obj.replaceDigits("a1b2c3d4e"))
}