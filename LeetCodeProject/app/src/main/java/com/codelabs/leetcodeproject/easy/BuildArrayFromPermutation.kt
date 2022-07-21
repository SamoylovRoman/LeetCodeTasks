package com.codelabs.leetcodeproject.easy

class BuildArrayFromPermutation {
    fun buildArray(nums: IntArray): IntArray {
        return nums.map {
            nums[it]
        }.toIntArray()
    }
}

fun main() {
    val obj = BuildArrayFromPermutation()
    obj.buildArray(intArrayOf(0,2,1,5,3,4)).forEach {
        print("$it ")
    }
    println()
    obj.buildArray(intArrayOf(5,0,1,2,3,4)).forEach {
        print("$it ")
    }
}