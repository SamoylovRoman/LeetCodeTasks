package com.codelabs.leetcodeproject.easy

class SelfDividingNumbers {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val list = mutableListOf<Int>()
        var strDigits: String
        var flagIsSelfDiv = true
        (left..right).forEach {
            strDigits = it.toString()
            for (i in strDigits.indices) {
                if (strDigits[i].toInt() - 48 != 0) {
                    if (it % (strDigits[i].toInt() - 48) != 0) {
                        flagIsSelfDiv = false
                        break
                    }
                } else {
                    flagIsSelfDiv = false
                    break
                }
            }
            if (flagIsSelfDiv) {
                list += it
            } else {
                flagIsSelfDiv = true
            }
        }
        return list
    }
}

fun main() {
    val obj = SelfDividingNumbers()
    obj.selfDividingNumbers(1, 22).forEach { print("$it ") }
    println()
    obj.selfDividingNumbers(47, 85).forEach { print("$it ") }
    println()
}