package com.codelabs.leetcodeproject.easy

class NumberOfRecentCalls {

    val list = mutableListOf<Int>()

    fun ping(t: Int): Int {
        list.add(t)
        var count = 0
        for (i in list.size - 1 downTo 0) {
            if (list[i] in t - 3000..t) count++
            else break
        }
        return count
    }

//    fun ping(t: Int): Int {
//        list.add(t)
//        return list.count { it in t - 3000..t }
//    }
}

fun main() {
    val obj = NumberOfRecentCalls()
    println(obj.ping(1))
    println(obj.ping(100))
    println(obj.ping(3001))
    println(obj.ping(3002))
}
