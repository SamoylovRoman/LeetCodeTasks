package com.codelabs.leetcodeproject.easy

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }
}

fun main() {
    val obj = PalindromeNumber()
    println(obj.isPalindrome(121))
    println(obj.isPalindrome(-121))
    println(obj.isPalindrome(10))
}