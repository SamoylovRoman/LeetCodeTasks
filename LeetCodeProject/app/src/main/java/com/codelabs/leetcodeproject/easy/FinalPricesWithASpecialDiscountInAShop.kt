package com.codelabs.leetcodeproject.easy

import java.util.*

class FinalPricesWithASpecialDiscountInAShop {
    fun finalPrices(prices: IntArray): IntArray {
        for (i in prices.indices) {
            for (j in prices.indices) {
                if (j > i && prices[j] <= prices[i] && i != j) {
                    prices[i] -= prices[j]
                    break
                }
            }
        }
        return prices
    }
}

fun main() {
    val obj = FinalPricesWithASpecialDiscountInAShop()
    obj.finalPrices(intArrayOf(8, 4, 6, 2, 3)).forEach { print("$it ") }
    println()
    obj.finalPrices(intArrayOf(1, 2, 3, 4, 5)).forEach { print("$it ") }
    println()
    obj.finalPrices(intArrayOf(10, 1, 1, 6)).forEach { print("$it ") }
    println()
}