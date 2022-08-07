package com.codelabs.leetcodeproject.easy

class DIStringMatch {
    fun diStringMatch(s: String): IntArray {
        val arr = IntArray(s.length + 1)
        var startNumber = 0
        var endNumber = s.length
        for (i in s.indices) {
            if (s[i] == 'I') arr[i] = startNumber++ else arr[i] = endNumber--
        }
        arr[s.length] = endNumber
        return arr
    }
}

fun main() {
    val obj = DIStringMatch()
    obj.diStringMatch("IDID").forEach { print("$it ") }
    println()
    obj.diStringMatch("III").forEach { print("$it ") }
    println()
    obj.diStringMatch("DDI").forEach { print("$it ") }
}