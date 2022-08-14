package com.codelabs.leetcodeproject.easy

class BaseballGame {
    fun calPoints(ops: Array<String>): Int {
        val list = mutableListOf<Int>()
        ops.forEach {
            when (it) {
                "C" -> list.removeAt(list.lastIndex)
                "D" -> list.add(2 * list[list.lastIndex])
                "+" -> list.add(list[list.lastIndex] + list[list.lastIndex - 1])
                else -> list.add(it.toInt())
            }
        }
        return list.sum()
    }
}

fun main() {
    val obj = BaseballGame()
    println(obj.calPoints(arrayOf("5", "2", "C", "D", "+")))
    println(obj.calPoints(arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")))
    println(obj.calPoints(arrayOf("1", "C")))
}