package com.codelabs.leetcodeproject.easy

class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    fun areOccurrencesEqual(s: String): Boolean {
//        return s.groupingBy { it }.eachCount().values.toSet().size == 1
        return  s.groupBy { it }.map { it.value.size }.toSet().size == 1
    }
}

fun main() {
    val obj = CheckIfAllCharactersHaveEqualNumberOfOccurrences()
    println(obj.areOccurrencesEqual("abacbc"))
    println(obj.areOccurrencesEqual("aaabb"))
}