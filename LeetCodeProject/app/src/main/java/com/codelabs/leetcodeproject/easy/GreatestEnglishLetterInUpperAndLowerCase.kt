package com.codelabs.leetcodeproject.easy

class GreatestEnglishLetterInUpperAndLowerCase {
    fun greatestLetter(s: String): String {
        s.toSortedSet().sortedDescending().forEach {
            if (it in 'a'..'z' && s.contains(it.toUpperCase()))
                return it.toUpperCase().toString()
        }
        return ""
    }
}

fun main() {
    val obj = GreatestEnglishLetterInUpperAndLowerCase()
    println(obj.greatestLetter("lEeTcOdE"))
    println(obj.greatestLetter("arRAzFif"))
    println(obj.greatestLetter("AbCdEfGhIjK"))

}