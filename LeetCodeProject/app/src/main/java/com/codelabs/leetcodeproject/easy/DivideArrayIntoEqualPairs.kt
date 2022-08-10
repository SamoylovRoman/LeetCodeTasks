package com.codelabs.leetcodeproject.easy

class DivideArrayIntoEqualPairs {
    fun divideArray2(nums: IntArray): Boolean {
//        return nums.sorted().chunked(2).count { it[0] == it[1] } == nums.size/2
        return nums.groupBy { it }.filter { it.value.size % 2 != 0 }.isEmpty()
    }

    fun divideArray(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        nums.forEach {
            if (!set.add(it)) set.remove(it)
        }
        return set.isEmpty()
    }
}

fun main() {
    val obj = DivideArrayIntoEqualPairs()
    println(obj.divideArray(intArrayOf(3, 2, 3, 2, 2, 2)))
    println(obj.divideArray(intArrayOf(1, 2, 3, 4)))
}