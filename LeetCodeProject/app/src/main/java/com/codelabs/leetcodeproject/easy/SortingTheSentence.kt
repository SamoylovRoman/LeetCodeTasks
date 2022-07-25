package com.codelabs.leetcodeproject.easy

class SortingTheSentence {
    fun sortSentence(s: String): String {
        val map = mutableMapOf<Char, String>().toSortedMap()
        s.split(" ").forEach {
            map[it[it.length - 1]] = it.substring(0, it.length - 1)
        }
        return map.values.joinToString(" ")
    }
}

fun main() {
    val obj = SortingTheSentence()
    println(obj.sortSentence("is2 sentence4 This1 a3"))
    println(obj.sortSentence("Myself2 Me1 I4 and3"))
}