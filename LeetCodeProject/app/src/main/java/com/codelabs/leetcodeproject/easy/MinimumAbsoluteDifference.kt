package com.codelabs.leetcodeproject.easy

class MinimumAbsoluteDifference {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        if (arr.size == 2) return listOf(arr.sorted().toList())
        arr.sort()
        val list = mutableListOf<List<Int>>()
        var absMin = Int.MAX_VALUE
        for (i in 0..arr.size - 2) {
            val dif = arr[i + 1] - arr[i]
            if (dif < absMin) {
                list.clear()
                absMin = dif
            }
            if (dif == absMin) {
                list.add(listOf(arr[i], arr[i + 1]))
            }
        }
        return list
    }
}

fun main() {
    val obj = MinimumAbsoluteDifference()
    obj.minimumAbsDifference(intArrayOf(4, 2, 1, 3)).forEach {
        it.forEach { x -> print("$x ") }
        print("|")
    }
    println()
    obj.minimumAbsDifference(intArrayOf(1, 3, 6, 10, 15)).forEach {
        it.forEach { x -> print("$x ") }
        print("|")
    }
    println()
    obj.minimumAbsDifference(intArrayOf(3, 8, -10, 23, 19, -4, -14, 27)).forEach {
        it.forEach { x -> print("$x ") }
        print("|")
    }
    println()
}