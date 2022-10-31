package com.codelabs.leetcodeproject.easy

class CalculateMoneyInLeetcodeBank {
    fun totalMoney(n: Int): Int {
        var days = 1
        var amount = 0
        var sum = 0
        while (days <= n) {
            if (days % 7 == 1) {
                amount = days / 7 + 1
            } else {
                amount++
            }
            sum += amount
            days++
        }
        return sum
    }
}

fun main() {
    val obj = CalculateMoneyInLeetcodeBank()
    println(obj.totalMoney(4))
    println(obj.totalMoney(10))
    println(obj.totalMoney(20))
}