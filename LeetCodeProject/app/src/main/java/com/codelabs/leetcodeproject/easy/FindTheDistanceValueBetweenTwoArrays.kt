package com.codelabs.leetcodeproject.easy

import kotlin.math.abs

class FindTheDistanceValueBetweenTwoArrays {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        var count = 0
        var flag = true
        for (i in arr1.indices) {
            for (j in arr2.indices) {
                if (abs(arr1[i] - arr2[j]) <= d) {
                    flag = false
                    break
                }
            }
            if (flag) {
                count++
            } else {
                flag = true
            }
        }
        return count
    }
}

fun main() {
    val obj = FindTheDistanceValueBetweenTwoArrays()
    println(obj.findTheDistanceValue(intArrayOf(4, 5, 8), intArrayOf(10, 9, 1, 8), 2))
    println(obj.findTheDistanceValue(intArrayOf(1, 4, 2, 3), intArrayOf(-4, -3, 6, 10, 20, 30), 3))
    println(obj.findTheDistanceValue(intArrayOf(2, 1, 100, 3), intArrayOf(-5, -2, 10, -3, 7), 6))
}