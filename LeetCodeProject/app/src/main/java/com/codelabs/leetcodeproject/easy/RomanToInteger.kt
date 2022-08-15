package com.codelabs.leetcodeproject.easy

class RomanToInteger {
    fun romanToInt(s: String): Int {
        val map = mapOf(
            "M" to 1000,
            "CM" to 900,
            "D" to 500,
            "CD" to 400,
            "C" to 100,
            "XC" to 90,
            "L" to 50,
            "XL" to 40,
            "X" to 10,
            "IX" to 9,
            "V" to 5,
            "IV" to 4,
            "I" to 1
        )
        var value = 0
        var index = 0
        do {
            if (index + 1 < s.length && map["${s[index]}${s[index + 1]}"] != null) {
                value += map["${s[index]}${s[index + 1]}"]!!
                index += 2
            } else if (map["${s[index]}"] != null) {
                value += map["${s[index]}"]!!
                index++
            }
        } while (index < s.length)
        return value
    }
}

fun main() {
    val obj = RomanToInteger()
    println(obj.romanToInt("III"))
    println(obj.romanToInt("LVIII"))
    println(obj.romanToInt("MCMXCIV"))
}