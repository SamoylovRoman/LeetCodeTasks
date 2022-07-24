package com.codelabs.leetcodeproject.easy

class DecompressRunLengthEncodedList {
    fun decompressRLElist(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for (i in nums.indices step 2) {
            for (j in 0 until nums[i]) {
                list += nums[i + 1]
            }
        }
        return list.toIntArray()
    }
}

fun main() {
    val obj = DecompressRunLengthEncodedList()
    obj.decompressRLElist(intArrayOf(1, 2, 3, 4)).forEach {
        print("$it ")
    }
    println()
    obj.decompressRLElist(intArrayOf(1, 1, 2, 3)).forEach {
        print("$it ")
    }
    println()
}