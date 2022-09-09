package com.codelabs.leetcodeproject.medium

class StoneGame {
    fun stoneGame(piles: IntArray): Boolean {
        var sumAlice = 0
        var sumBob = 0
        var firstIndex = 0
        var lastIndex = piles.size - 1
        var aliceTurn = true
        while (firstIndex <= lastIndex) {
            val a = piles[firstIndex]
            val b = piles[lastIndex]
            if (aliceTurn) {
                if (a > b) {
                    sumAlice += a
                    firstIndex++
                } else {
                    sumAlice += b
                    lastIndex--
                }
            } else {
                if (a < b) {
                    sumBob += a
                    firstIndex++
                } else {
                    sumBob += b
                    lastIndex--
                }
            }
            aliceTurn = !aliceTurn
        }
        println("Alice = $sumAlice")
        println("Bob = $sumBob")
        return sumAlice > sumBob
    }
}

fun main() {
    val obj = StoneGame()
    println(obj.stoneGame(intArrayOf(7, 8, 8, 10)))
    println(obj.stoneGame(intArrayOf(3, 2, 10, 4)))
    println(obj.stoneGame(intArrayOf(5, 3, 4, 5)))
    println(obj.stoneGame(intArrayOf(3, 7, 2, 3)))
}