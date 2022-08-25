package com.codelabs.leetcodeproject.easy

class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        return nums1.intersect(nums2.toList().toSet()).toIntArray()
    }
}

fun main() {
    val obj = IntersectionOfTwoArrays()
    obj.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).forEach { print("$it ") }
    println()
}