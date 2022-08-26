package com.codelabs.leetcodeproject.easy

class DeleteColumnsToMakeSorted {
    fun minDeletionSize(strs: Array<String>): Int {
        var count = 0
        for (i in 0 until strs[0].length) {
            for (j in 0..strs.size - 2) {
                if (strs[j][i] > strs[j + 1][i]) {
                    count++
                    break
                }
            }
        }
        return count
    }
}

fun main() {
    val obj = DeleteColumnsToMakeSorted()
    println(obj.minDeletionSize(arrayOf("cba", "daf", "ghi")))
    println(obj.minDeletionSize(arrayOf("a", "b")))
}