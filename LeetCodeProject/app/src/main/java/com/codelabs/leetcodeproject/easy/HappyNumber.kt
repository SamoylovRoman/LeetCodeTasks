package com.codelabs.leetcodeproject.easy

import java.lang.Math.pow

class HappyNumber {
    fun isHappy(n: Int): Boolean {
        val list = emptyList<Int>().toMutableList()
        var newN = n.toString()
        var sum: Int
        while (true) {
            sum = 0
            newN.forEach {
                sum += pow((it.toInt() - 48).toDouble(), 2.0).toInt()
            }
            if (sum == 1) break
            if (list.contains(sum)) return false
            list.add(sum)
            newN = sum.toString()
        }
        return true
    }
}

fun main() {
    val obj = HappyNumber()
    println(obj.isHappy(201))
    println(obj.isHappy(19))
    println(obj.isHappy(2))
    println(obj.isHappy(7))
}