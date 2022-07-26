package com.codelabs.leetcodeproject.easy

class SumOfAllOddLengthSubarrays {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = 0
        for (i in 1..arr.size step 2) {
            for (j in 0..arr.size - i) {
                for (k in j until j + i) {
                    sum += arr[k]
                }
            }
        }
        return sum
    }
}

fun main() {
    val obj = SumOfAllOddLengthSubarrays()
    println(obj.sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)))
}