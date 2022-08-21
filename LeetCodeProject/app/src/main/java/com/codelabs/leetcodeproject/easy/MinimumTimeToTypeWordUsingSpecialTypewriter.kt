package com.codelabs.leetcodeproject.easy

import java.lang.Math.*

class MinimumTimeToTypeWordUsingSpecialTypewriter {
    fun minTimeToType(word: String): Int {
//        word.forEach {
//            print("${it - 'a' + 1} ")
//        }
        var cur = 'a'
        var time = 0
        for (w in word) {
            val cost = abs(w - cur)
            time += min(cost, 26 - cost)
            cur = w
        }
        return time + word.length
//        val arr = word.map { it - 'a' + 1 }
//        var sum = if (word[0] == 'a') 1 else 2
//        for (i in 0..arr.size - 2) {
//            sum += if (kotlin.math.abs(arr[i + 1] - arr[i]) > 12) {
//                26 - kotlin.math.abs(arr[i] - arr[i + 1])
//            } else {
//                kotlin.math.abs(arr[i + 1] - arr[i])
//            }
//            sum++
//        }
//        return sum
    }
}

fun main() {
    val obj = MinimumTimeToTypeWordUsingSpecialTypewriter()
    println(obj.minTimeToType("abc"))
    println(obj.minTimeToType("bza"))
    println(obj.minTimeToType("zjpc"))
    println(obj.minTimeToType("pdy"))
}