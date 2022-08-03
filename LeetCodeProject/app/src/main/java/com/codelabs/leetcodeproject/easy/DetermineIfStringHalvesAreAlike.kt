package com.codelabs.leetcodeproject.easy

class DetermineIfStringHalvesAreAlike {
    fun halvesAreAlike(s: String): Boolean {
        val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        return s.substring(0, s.length / 2).count {
            vowels.contains(it)
        } == s.substring(s.length / 2, s.length).count {
            vowels.contains(it)
        }
    }
}

fun main() {
    val obj = DetermineIfStringHalvesAreAlike()
    println(obj.halvesAreAlike("book"))
    println(obj.halvesAreAlike("textbook"))
}