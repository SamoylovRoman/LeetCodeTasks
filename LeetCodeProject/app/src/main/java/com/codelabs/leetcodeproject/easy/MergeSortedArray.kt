package com.codelabs.leetcodeproject.easy

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for ((j, i) in (m until m + n).withIndex()) {
            nums1[i] = nums2[j]
        }
        var tmp: Int
        for (i in nums1.indices) {
            for (j in i + 1 until nums1.size) {
                if (nums1[i] > nums1[j]) {
                    tmp = nums1[j]
                    nums1[j] = nums1[i]
                    nums1[i] = tmp
                }
            }
        }
        nums1.forEach {
            println(it)
        }
    }

}

fun main() {
    val newMerge = MergeSortedArray()
    newMerge.merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
}