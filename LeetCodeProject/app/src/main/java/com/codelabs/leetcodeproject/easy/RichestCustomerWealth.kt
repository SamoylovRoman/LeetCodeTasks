package com.codelabs.leetcodeproject.easy

import kotlin.math.max

class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var wealth = 0
        accounts.forEach {
            wealth = max(it.sum(), wealth)
        }
        return wealth
/*        return accounts.maxOf {
            it.sum()
        }*/
    }
}

fun main() {
    val obj = RichestCustomerWealth()
    println(
        obj.maximumWealth(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(3, 2, 1)
            )
        )
    )
}