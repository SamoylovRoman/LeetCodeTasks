package com.codelabs.leetcodeproject.easy

class SubstringsOfSizeThreeWithDistinctCharacters {
    fun countGoodSubstrings2(s: String): Int {
        var count = 0
        for (i in 0..s.length - 3) {
            if (s.substring(i, i + 3).toSet().size == 3) {
                count++
            }
        }
        return count
    }

    fun countGoodSubstrings(s: String): Int {
        return s.windowed(3, 1).count { it.toSet().size == 3 }
    }
}

fun main() {
    val obj = SubstringsOfSizeThreeWithDistinctCharacters()
    println(obj.countGoodSubstrings("xyzzaz"))
    println(obj.countGoodSubstrings("aababcabc"))
}