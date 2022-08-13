package com.codelabs.leetcodeproject.easy

class MaximumNumberOfBallsInABox {
    fun countBalls(lowLimit: Int, highLimit: Int) = (lowLimit..highLimit).map {
        it.toString().toCharArray().sumBy { ch ->
            ch.toInt() - 48
        }
    }.groupBy { it }.values.map { it.size }.sorted().last()
}

fun main() {
    val obj = MaximumNumberOfBallsInABox()
    println(obj.countBalls(1, 10))
    println(obj.countBalls(5, 15))
    println(obj.countBalls(19, 28))
}