package com.codelabs.leetcodeproject.easy

class TwoOutOfThree {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
//        (nums1.toSet().toList() + nums2.toSet().toList() + nums3.toSet()
//            .toList()).forEach { println(it) }
        return (nums1.toSet().toList() + nums2.toSet().toList() + nums3.toSet()
            .toList()).groupBy { it }
            .filter { it.value.size > 1 }.keys.toList()
    }
}

fun main() {
    val obj = TwoOutOfThree()
    obj.twoOutOfThree(intArrayOf(1, 1, 3, 2), intArrayOf(2, 3), intArrayOf(3)).forEach {
        print("$it ")
    }
    println()
    obj.twoOutOfThree(intArrayOf(3, 1), intArrayOf(2, 3), intArrayOf(1, 2)).forEach {
        print("$it ")
    }
    println()
    obj.twoOutOfThree(intArrayOf(1, 2, 2), intArrayOf(4, 3, 3), intArrayOf(5)).forEach {
        print("$it ")
    }
    println()
}