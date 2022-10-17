package com.codelabs.leetcodeproject.easy

class NumberComplement {
    fun findComplement(num: Int): Int {
        var str = ""
        Integer.toBinaryString(num).forEach { ch ->
            str += if (ch == '1') '0'
            else '1'
        }
        return Integer.parseInt(str, 2)
    }
}

fun main() {
    val obj = NumberComplement()
    println(obj.findComplement(5))
    println(obj.findComplement(1))
}