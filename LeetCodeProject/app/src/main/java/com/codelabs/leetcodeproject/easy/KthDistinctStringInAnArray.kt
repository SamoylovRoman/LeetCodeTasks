package com.codelabs.leetcodeproject.easy

class KthDistinctStringInAnArray {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        return arr.groupBy { it }.filter { it.value.size == 1 }.keys.elementAtOrElse(k - 1) {""}
    }
}

fun main() {
    val obj = KthDistinctStringInAnArray()
    println(obj.kthDistinct(arrayOf("d", "b", "c", "b", "c", "a"), 2))
    println(obj.kthDistinct(arrayOf("aaa", "aa", "a"), 1))
}