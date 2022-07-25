package com.codelabs.leetcodeproject.easy

class SplitAStringInBalancedStrings {
    fun balancedStringSplit(s: String): Int {
        var leftRight = 0
        var count = 0
        s.forEach {
            when (it) {
                'R' -> {
                    leftRight++
                }
                'L' -> {
                    leftRight--
                }
            }
            if (leftRight == 0) {
                count++
            }
        }
        return count
    }
}

fun main() {
    val obj = SplitAStringInBalancedStrings()
    println(obj.balancedStringSplit("RLRRLLRLRL"))
    println(obj.balancedStringSplit("RLRRRLLRLL"))
    println(obj.balancedStringSplit("LLLLRRRR"))
}