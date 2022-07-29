package com.codelabs.leetcodeproject.easy

import kotlin.math.abs

class CountGoodTriplets {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var count = 0
        for (i in 0..arr.size - 3) {
            for (j in i + 1..arr.size - 2) {
                for (k in j + 1 until arr.size) {
                    if (abs(arr[i] - arr[j]) <= a &&
                        abs(arr[j] - arr[k]) <= b &&
                        abs(arr[i] - arr[k]) <= c
                    ) {
                        count++
                    }
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = CountGoodTriplets()
    println(obj.countGoodTriplets(intArrayOf(3, 0, 1, 1, 9, 7), 7, 2, 3))
}