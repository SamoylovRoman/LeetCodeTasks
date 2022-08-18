package com.codelabs.leetcodeproject.easy

class CheckIfAllAsAppearsBeforeAllBs {
    fun checkString(s: String): Boolean {
        for (i in 0..s.length - 2) {
            if (s[i + 1] < s[i]) return false
        }
        return true
    }
}

fun main() {
    val obj = CheckIfAllAsAppearsBeforeAllBs()
    println(obj.checkString("aaabbb"))
    println(obj.checkString("abab"))
    println(obj.checkString("bbb"))
}