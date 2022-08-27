package com.codelabs.leetcodeproject.easy

class FindTheDifferenceOfTwoArrays {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        val tmpList1 = mutableListOf<Int>()
        nums1.toSet().forEach {
            if (!nums2.contains(it)) tmpList1.add(it)
        }
        list.add(tmpList1)
        val tmpList2 = mutableListOf<Int>()
        nums2.toSet().forEach {
            if (!nums1.contains(it)) tmpList2 += it
        }
        list.add(tmpList2)
        return list
    }

    fun findDifference2(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        return listOf(
            (set1 - set2).toList(),
            (set2 - set1).toList()
        )
    }
}

fun main() {
    val obj = FindTheDifferenceOfTwoArrays()
    obj.findDifference(intArrayOf(1, 2, 3), intArrayOf(2, 4, 6)).forEach {
        print("$it ")
    }
    println()
    obj.findDifference(intArrayOf(1, 2, 3, 3), intArrayOf(1, 1, 2, 2)).forEach {
        print("$it ")
    }
}