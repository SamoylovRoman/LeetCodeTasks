package com.codelabs.leetcodeproject.easy

class CountEqualAndDivisiblePairsInAnArray {
    fun countPairs(nums: IntArray, k: Int): Int {
        var count = 0
        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] &&
                    (i * j) % k == 0
                ) {
                    count++
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = CountEqualAndDivisiblePairsInAnArray()
    println(obj.countPairs(intArrayOf(3, 1, 2, 2, 2, 1, 3), 2))
    println(obj.countPairs(intArrayOf(1, 2, 3, 4), 1))
}