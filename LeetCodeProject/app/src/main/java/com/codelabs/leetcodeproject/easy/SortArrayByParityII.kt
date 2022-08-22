package com.codelabs.leetcodeproject.easy

class SortArrayByParityII {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        val arr = IntArray(nums.size) { 0 }
        var oddIndex = 1
        var evenIndex = 0
        for (x in nums) {
            if (x % 2 == 0) {
                arr[evenIndex] = x
                evenIndex += 2
            } else {
                arr[oddIndex] = x
                oddIndex += 2
            }
        }
        return arr
    }

}

fun main() {
    val obj = SortArrayByParityII()
    obj.sortArrayByParityII(intArrayOf(4, 2, 5, 7)).forEach { print("$it ") }
    println()
    obj.sortArrayByParityII(intArrayOf(2, 3)).forEach { print("$it ") }
    println()
    obj.sortArrayByParityII(intArrayOf(3, 4)).forEach { print("$it ") }
    println()
}