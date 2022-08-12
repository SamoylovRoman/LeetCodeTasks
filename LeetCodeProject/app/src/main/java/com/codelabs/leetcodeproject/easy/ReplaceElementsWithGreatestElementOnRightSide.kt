package com.codelabs.leetcodeproject.easy

class ReplaceElementsWithGreatestElementOnRightSide {
    fun replaceElements2(arr: IntArray): IntArray {
        var rightMax: Int
        for (i in arr.indices) {
            rightMax = -1
            for (j in i + 1 until arr.size) {
                if (arr[j] > rightMax) rightMax = arr[j]
            }
            arr[i] = rightMax
        }
        return arr
    }

    fun replaceElements(arr: IntArray): IntArray {
        var rightMax = -1
        var tmp: Int
        for (i in arr.size - 1 downTo 0) {
            tmp = arr[i]
            arr[i] = rightMax
            if (rightMax < tmp) rightMax = tmp
        }
        return arr
    }
}

fun main() {
    val obj = ReplaceElementsWithGreatestElementOnRightSide()
    obj.replaceElements(intArrayOf(17, 18, 5, 4, 6, 1)).forEach { print("$it ") }
    println()
    obj.replaceElements(intArrayOf(400)).forEach { print("$it ") }
    println()
}