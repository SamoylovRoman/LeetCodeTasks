package com.codelabs.leetcodeproject.easy

class CheckIfNumberHasEqualDigitCountAndDigitValue {
    fun digitCount(num: String): Boolean {
        val map = num.toCharArray().map { it.toInt() - 48 }.groupBy { it }
        for (i in num.indices) {
            if (map[i] != null) {
                if (map[i]?.size != num[i].toInt() - 48) return false
            } else {
                if (num[i].toInt() - 48 != 0) return false
            }
        }
        return true
    }
}

fun main() {
    val obj = CheckIfNumberHasEqualDigitCountAndDigitValue()
    println(obj.digitCount("1210"))
    println(obj.digitCount("030"))
}