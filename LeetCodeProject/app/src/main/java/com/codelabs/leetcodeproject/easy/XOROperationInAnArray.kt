package com.codelabs.leetcodeproject.easy

class XOROperationInAnArray {
    fun xorOperation(n: Int, start: Int): Int {
        var xOR = start
        for (i in 1 until n) {
            xOR = (xOR xor (start + 2 * i))
        }
        return xOR
    }
}

fun main() {
    val obj = XOROperationInAnArray()
    println(obj.xorOperation(n = 5, start = 0))
    println(obj.xorOperation(n = 4, start = 3))
}