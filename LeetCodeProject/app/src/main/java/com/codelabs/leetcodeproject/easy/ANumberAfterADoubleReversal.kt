package com.codelabs.leetcodeproject.easy

class ANumberAfterADoubleReversal {
    fun isSameAfterReversals(num: Int): Boolean {
        return num % 10 != 0 || num == 0
    }
}

fun main() {
    val obj = ANumberAfterADoubleReversal()
    println(obj.isSameAfterReversals(526))
    println(obj.isSameAfterReversals(1800))
    println(obj.isSameAfterReversals(0))
}