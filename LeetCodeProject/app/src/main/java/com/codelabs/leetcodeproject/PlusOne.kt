package com.codelabs.leetcodeproject

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var index = digits.size - 1
        if (digits[index] < 9) {
            digits[index]++
        } else {
            digits[index] = 0
            index--
            while (index >= 0) {
                digits[index]++
                if (digits[index] < 10) {
                    break
                } else {
                    digits[index] = 0
                    index--
                }
            }
        }
        if (index < 0) {
            val newDigit = intArrayOf(1)
            return newDigit + digits
        }
        return digits
    }
}

fun main() {
    val obj = PlusOne()
    obj.plusOne(intArrayOf(1, 2, 3)).forEach {
        println(it)
    }
    println()
    obj.plusOne(intArrayOf(9, 9, 9, 9)).forEach {
        println(it)
    }
}