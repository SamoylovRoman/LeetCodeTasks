package com.codelabs.leetcodeproject.easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val word = strs[0]
        var pref = ""
        for (i in word.indices) {
            pref += word[i]
            strs.forEach {
                if (!it.startsWith(pref)) {
                    return pref.dropLast(1)
                }
            }
        }
        return pref
    }
}

fun main() {
    val obj = LongestCommonPrefix()
    println(obj.longestCommonPrefix(arrayOf("c", "acc", "ccc")))
    println(obj.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(obj.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    println(obj.longestCommonPrefix(arrayOf("a")))
}