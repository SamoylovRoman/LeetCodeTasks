package com.codelabs.leetcodeproject.medium

import kotlin.math.abs

class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    fun minOperations(boxes: String): IntArray {
        val answer = IntArray(boxes.length) { 0 }
        for (i in boxes.indices) {
            for (j in boxes.indices) {
                if (boxes[j] == '1') {
                    answer[i] += abs(i - j)
                }
            }
        }
        return answer
    }
}

fun main() {
    val obj = MinimumNumberOfOperationsToMoveAllBallsToEachBox()
    obj.minOperations("110").forEach { print("$it ") }
    println()
    obj.minOperations("001011").forEach { print("$it ") }
    println()
}