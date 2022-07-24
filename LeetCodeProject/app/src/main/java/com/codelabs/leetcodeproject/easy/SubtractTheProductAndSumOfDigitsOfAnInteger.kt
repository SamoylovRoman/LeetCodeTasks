package com.codelabs.leetcodeproject.easy

class SubtractTheProductAndSumOfDigitsOfAnInteger {
    fun subtractProductAndSum(n: Int): Int {
        val array = n.toString().map { it.toInt() - 48 }
        var sum = 0
        var mult = 1
        array.forEach {
            sum += it
            mult *= it
        }
        return mult - sum
    }
}

fun main() {
    val obj = SubtractTheProductAndSumOfDigitsOfAnInteger()
    println(obj.subtractProductAndSum(234))
    println(obj.subtractProductAndSum(4421))
}