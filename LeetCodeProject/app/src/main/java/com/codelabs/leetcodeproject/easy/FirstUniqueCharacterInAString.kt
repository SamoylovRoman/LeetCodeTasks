package com.codelabs.leetcodeproject.easy

class FirstUniqueCharacterInAString {
    fun firstUniqChar(s: String): Int {
        return s.groupBy { it }.values.firstOrNull { it.size == 1 }?.let { s.indexOf(it[0]) } ?: -1
//        return s.indexOfFirst { it == ch[0] }
    }
}

fun main() {
    val obj = FirstUniqueCharacterInAString()
    println(obj.firstUniqChar("leetcode"))
    println(obj.firstUniqChar("loveleetcode"))
    println(obj.firstUniqChar("aabb"))
}