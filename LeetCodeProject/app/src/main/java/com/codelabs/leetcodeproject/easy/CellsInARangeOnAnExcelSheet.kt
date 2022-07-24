package com.codelabs.leetcodeproject.easy

class CellsInARangeOnAnExcelSheet {
    fun cellsInRange(s: String): List<String> {
        val list = mutableListOf<String>()
        for (i in s[0]..s[3]) {
            for (j in (s[1].toInt() - 48)..(s[4].toInt() - 48)) {
                list.add("$i$j")
            }
        }
        return list
    }
}

fun main() {
    val obj = CellsInARangeOnAnExcelSheet()
    obj.cellsInRange("K1:L2").forEach {
        print("$it ")
    }
    println()
    obj.cellsInRange("A1:F1").forEach {
        print("$it ")
    }
    println()
}