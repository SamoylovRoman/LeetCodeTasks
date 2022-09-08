package com.codelabs.leetcodeproject.medium

class StrictlyPalindromicNumber {
    fun isStrictlyPalindromic(n: Int): Boolean {
        var number: Int
        var str: String
        for (i in 2..n - 2) {
            number = n
            str = ""
            while (number > 0) {
                str += number % i
                number /= i
            }
            if (str != str.reversed()) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val obj = StrictlyPalindromicNumber()
    println(obj.isStrictlyPalindromic(9))
    println(obj.isStrictlyPalindromic(4))
}