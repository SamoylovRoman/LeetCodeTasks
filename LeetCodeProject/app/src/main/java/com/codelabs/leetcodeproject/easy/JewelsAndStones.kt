package com.codelabs.leetcodeproject.easy

class JewelsAndStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var count = 0
        stones.forEach {
            if (jewels.contains(it)) {
                count++
            }
        }
        return count
    }
}

fun main() {
    val obj = JewelsAndStones()
    println(obj.numJewelsInStones("aA", "aAAbbbb"))
    println(obj.numJewelsInStones("z", "ZZ"))
}