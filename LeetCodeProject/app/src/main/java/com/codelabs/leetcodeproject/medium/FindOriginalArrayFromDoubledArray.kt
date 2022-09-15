package com.codelabs.leetcodeproject.medium

class FindOriginalArrayFromDoubledArray {
    fun findOriginalArray(changed: IntArray): IntArray {
        if (changed.size % 2 != 0) return IntArray(0)
        val list = mutableListOf<Int>()
        changed.sort()
        var index = 0
        var x: Int
        var index2: Int
        while (index != changed.size - 1) {
            if (changed[index] == -1) {
                index++
                continue
            }
            x = changed[index]
            index2 = index + 1
            while (changed[index2] != 2 * x && index2 != changed.lastIndex) {
                index2++
            }
            if (changed[index2] == 2 * x) {
                list.add(x)
                changed[index2] = -1
            } else {
                return IntArray(0)
            }
            index++
        }
        return list.toIntArray()
    }
}

fun main() {
    val obj = FindOriginalArrayFromDoubledArray()
    obj.findOriginalArray(intArrayOf(1, 3, 4, 2, 6, 8)).forEach { print("$it ") }
    println()
    obj.findOriginalArray(intArrayOf(6, 3, 0, 1)).forEach { print("$it ") }
    println()
    obj.findOriginalArray(intArrayOf(1)).forEach { print("$it ") }
    println()
}