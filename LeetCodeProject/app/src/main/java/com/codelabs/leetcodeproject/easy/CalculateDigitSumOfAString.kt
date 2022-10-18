package com.codelabs.leetcodeproject.easy

class CalculateDigitSumOfAString {
    fun digitSum(s: String, k: Int): String {
        var str = s
        var tmpStr: String
        while (str.length > k) {
            tmpStr = ""
            str.chunked(k).forEach { st ->
                tmpStr += st.map { it.toInt() - 48 }.sum().toString()
            }
            str = tmpStr
        }
        return str
    }
}

fun main() {
    val obj = CalculateDigitSumOfAString()
    println(obj.digitSum("11111222223", 3))
    println(obj.digitSum("00000000", 3))
}