package com.codelabs.leetcodeproject.easy

class SortEvenAndOddIndicesIndependently {
    fun sortEvenOdd(nums: IntArray): IntArray {
        val oddList = mutableListOf<Int>()
        val evenList = mutableListOf<Int>()
        nums.forEachIndexed { index, i ->
            if (index % 2 == 0) {
                evenList.add(i)
            } else {
                oddList.add(i)
            }
        }
        evenList.sort()
        oddList.sortDescending()
        var i = 0
        var j = 0
        var k = 0
        while (i < evenList.size) {
            nums[k] = evenList[i]
            if (j < oddList.size) {
                nums[k + 1] = oddList[j]
            }
            i++
            j++
            k += 2
        }
        return nums
    }
}

fun main() {
    val obj = SortEvenAndOddIndicesIndependently()
    obj.sortEvenOdd(intArrayOf(4, 1, 2, 3)).forEach { print("$it ") }
    println()
    obj.sortEvenOdd(intArrayOf(2, 1)).forEach { print("$it ") }
    println()
}