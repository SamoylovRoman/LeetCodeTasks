package com.codelabs.leetcodeproject.easy

class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    fun minimumSum(num: Int): Int {
        val array = num.toString().map { it.toInt() - 48 }.sorted()
        return 10 * array[0] + 10 * array[1] + array[2] + array[3]
    }
}

fun main() {
    val obj = MinimumSumOfFourDigitNumberAfterSplittingDigits()
    println(obj.minimumSum(2932))
    println(obj.minimumSum(4009))
}