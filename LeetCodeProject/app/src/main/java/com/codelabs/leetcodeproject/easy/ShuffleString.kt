package com.codelabs.leetcodeproject.easy

class ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        val array = CharArray(s.length)
        indices.forEachIndexed { index, i ->
            array[i] = s[index]
        }
        return array.joinToString("")
    }
}

fun main() {
    val obj = ShuffleString()
    println(obj.restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)))
    println(obj.restoreString("abc", intArrayOf(0, 1, 2)))
}