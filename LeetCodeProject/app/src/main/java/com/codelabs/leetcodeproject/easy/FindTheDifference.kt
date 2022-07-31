package com.codelabs.leetcodeproject.easy

class FindTheDifference {
    fun findTheDifference(s: String, t: String): Char {
/*        val masS = s.toCharArray().sorted()
        val masT = t.toCharArray().sorted()
        for (i in masS.indices) {
            if (masT[i] != masS[i]) return masT[i]
        }
        return masT[masS.size]*/

        // вырезаем по символу
        var newT = t
        s.forEach {
            newT = newT.replaceFirst(it.toString(), "", false)
        }
        return newT[0]
    }
}

fun main() {
    val obj = FindTheDifference()
    println(obj.findTheDifference("abcd", "abecd"))
    println(obj.findTheDifference("", "y"))
    println(obj.findTheDifference("a", "aa"))
}