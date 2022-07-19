package com.codelabs.leetcodeproject

class ReverseString {
    fun reverseString2(s: CharArray): Unit {
        s.reverse()
        s.forEach {
            print(it)
        }
    }

    fun reverseString(s: CharArray): Unit {
        val half: Int = s.size / 2
        var index = s.size - 1
        var tmp: Char
        for (i in 0 until half) {
            tmp = s[i]
            s[i] = s[index]
            s[index] = tmp
            index--
        }
        s.forEach {
            print(it)
        }
    }
}

fun main() {
    val obj = ReverseString()
    obj.reverseString(charArrayOf('h', 'e', 'l', 'l', 'o'))
}