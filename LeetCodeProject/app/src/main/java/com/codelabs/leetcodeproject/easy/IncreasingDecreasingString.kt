package com.codelabs.leetcodeproject.easy

class IncreasingDecreasingString {
    fun sortString(s: String): String {
        var str = ""
        val sortedMap = sortedMapOf<Char, Int>()
        s.forEach {
            if (sortedMap[it] != null) {
                sortedMap[it] = sortedMap[it]?.plus(1)
            } else {
                sortedMap[it] = 1
            }
        }
        var iter = sortedMap.values.sumBy { it }
        while (iter != 0) {
            sortedMap.keys.forEach {
                if (sortedMap[it] != 0) {
                    str += it
                    sortedMap[it] = sortedMap[it]?.minus(1)
                    iter--
                }
            }
            if (iter == 0) {
                break
            }
            sortedMap.keys.reversed().forEach {
                if (sortedMap[it] != 0) {
                    str += it
                    sortedMap[it] = sortedMap[it]?.minus(1)
                    iter--
                }
            }
        }
        return str
    }
}

fun main() {
    val obj = IncreasingDecreasingString()
    println(obj.sortString("leetcode"))
    println(obj.sortString("aaaabbbbcccc"))
    println(obj.sortString("rat"))
}