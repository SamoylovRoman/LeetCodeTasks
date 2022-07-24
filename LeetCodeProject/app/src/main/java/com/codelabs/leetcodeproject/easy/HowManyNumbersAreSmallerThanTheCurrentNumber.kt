package com.codelabs.leetcodeproject.easy

class HowManyNumbersAreSmallerThanTheCurrentNumber {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val array = IntArray(nums.size) { 0 }
        nums.forEachIndexed { index, i ->
            array[index] = nums.count { it < i }
        }
        return array
    }
}

fun main() {
    val obj = HowManyNumbersAreSmallerThanTheCurrentNumber()
    obj.smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).forEach {
        print("$it ")
    }
    println()
    obj.smallerNumbersThanCurrent(intArrayOf(6, 5, 4, 8)).forEach {
        print("$it ")
    }
    println()
    obj.smallerNumbersThanCurrent(intArrayOf(7, 7, 7, 7)).forEach {
        print("$it ")
    }
    println()
}