package com.codelabs.leetcodeproject.easy

class ShuffleTheArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val newArray = IntArray(nums.size) { 0 }
        var firstIndex = 0
        var secondIndex = n
        for (i in newArray.indices step 2) {
            newArray[i] = nums[firstIndex]
            newArray[i + 1] = nums[secondIndex]
            firstIndex++
            secondIndex++
        }
        return newArray
    }
}

fun main() {
    val obj = ShuffleTheArray()
    obj.shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).forEach {
        print("$it ")
    }
    println()
    obj.shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4).forEach {
        print("$it ")
    }
    println()

}