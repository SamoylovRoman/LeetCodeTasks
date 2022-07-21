package com.codelabs.leetcodeproject.easy

class RemoveElement {
    fun removeElement(nums: IntArray, v: Int): Int {
        var tmpIndex = nums.size - 1
        var tmp: Int
        for (i in nums.size - 1 downTo 0) {
            if (nums[i] == v) {
                tmp = nums[tmpIndex]
                nums[tmpIndex] = v
                nums[i] = tmp
                tmpIndex--
            }
        }
        tmpIndex++
        return tmpIndex
    }
}

fun main() {
    val v = RemoveElement()
    v.removeElement(intArrayOf(3, 2, 2, 3), 3)
    v.removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2)


}