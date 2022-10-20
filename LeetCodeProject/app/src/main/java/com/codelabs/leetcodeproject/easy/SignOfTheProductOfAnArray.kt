package com.codelabs.leetcodeproject.easy

class SignOfTheProductOfAnArray {
    fun arraySign(nums: IntArray): Int {
        var sign = 1
        nums.forEach {
            when {
                it < 0 -> sign *= -1
                it == 0 -> return 0
            }
        }
        return sign
    }
}

fun main() {
    val obj = SignOfTheProductOfAnArray()
    println(obj.arraySign(intArrayOf(-1, -2, -3, -4, 3, 2, 1)))
    println(obj.arraySign(intArrayOf(1, 5, 0, 2, -3)))
    println(obj.arraySign(intArrayOf(-1, 1, -1, 1, -1)))
}