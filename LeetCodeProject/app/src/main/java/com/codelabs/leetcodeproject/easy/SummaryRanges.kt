package com.codelabs.leetcodeproject.easy

class SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()
        val list = mutableListOf<String>()
        var startIndex = 0
        var i = 0
        while (i < nums.size - 1) {
            if (nums[i] + 1 == nums[i + 1]) {
                i++
            } else {
                if (startIndex == i) {
                    list.add("${nums[startIndex]}")
                } else {
                    list.add("${nums[startIndex]}->${nums[i]}")
                }
                i++
                startIndex = i
            }
        }
        if (startIndex == i) {
            list.add("${nums[startIndex]}")
        } else {
            list.add("${nums[startIndex]}->${nums[i]}")
        }
        return list
    }
}

fun main() {
    val obj = SummaryRanges()
    obj.summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)).forEach { print("$it ") }
    println()
    obj.summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)).forEach { print("$it ") }
    println()
}