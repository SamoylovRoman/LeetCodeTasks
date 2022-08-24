package com.codelabs.leetcodeproject.easy

class CountCommonWordsWithOneOccurrence {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        return (words1.groupBy { it }
            .filter { it.value.size == 1 }.keys.toList() +
                words2.groupBy { it }
                    .filter { it.value.size == 1 }.keys.toList()).groupBy { it }
            .count { it.value.size == 2 }
    }
}

fun main() {
    val obj = CountCommonWordsWithOneOccurrence()
    println(
        obj.countWords(
            arrayOf("leetcode", "is", "amazing", "as", "is"),
            arrayOf("amazing", "leetcode", "is")
        )
    )
    println(obj.countWords(arrayOf("b", "bb", "bbb"), arrayOf("a", "aa", "aaa")))
    println(obj.countWords(arrayOf("a", "ab"), arrayOf("a", "a", "a", "ab")))
}