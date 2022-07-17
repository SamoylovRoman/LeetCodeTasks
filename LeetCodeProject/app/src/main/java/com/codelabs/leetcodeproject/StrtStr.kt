package com.codelabs.leetcodeproject

class StrtStr {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle, 0, ignoreCase = false)
    }
}

fun main() {
    println(StrtStr().strStr("hello","ll"))
}