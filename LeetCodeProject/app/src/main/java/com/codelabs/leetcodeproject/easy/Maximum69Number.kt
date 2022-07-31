package com.codelabs.leetcodeproject.easy

class Maximum69Number {
    fun maximum69Number(num: Int): Int {
        val str = num.toString()
        return str.replaceFirst('6', '9').toInt()
    }
}

fun main() {
    val obj = Maximum69Number()
    println(obj.maximum69Number(9669))
    println(obj.maximum69Number(9996))
    println(obj.maximum69Number(9999))
}