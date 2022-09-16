package com.codelabs.leetcodeproject.easy

class FindWordsThatCanBeFormedByCharacters {

    fun countCharacters(words: Array<String>, chars: String): Int {
        val map = chars.groupBy { it }
        var sum = 0
        words.forEach { str ->
            var flag = true
            str.groupBy { it }.forEach loop@{ entry ->
                if (map[entry.key] == null || (map[entry.key] != null && entry.value.size > map[entry.key]!!.size)) {
                    flag = false
                    return@loop
                }
            }
            if (flag) {
                sum += str.length
            }
        }
        return sum
    }
}

fun main() {
    val obj = FindWordsThatCanBeFormedByCharacters()
    println(obj.countCharacters(arrayOf("cat", "bt", "hat", "tree"), "atach"))
    println(obj.countCharacters(arrayOf("hello", "world", "leetcode"), "welldonehoneyr"))
}