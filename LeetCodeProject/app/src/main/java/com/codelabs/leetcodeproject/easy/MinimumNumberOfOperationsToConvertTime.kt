package com.codelabs.leetcodeproject.easy

class MinimumNumberOfOperationsToConvertTime {
    fun convertTime(current: String, correct: String): Int {
        var count = 0
        val currentMinutes = current.split(":")[0].toInt() * 60 + current.split(":")[1].toInt()
        val correctMinutes = correct.split(":")[0].toInt() * 60 + correct.split(":")[1].toInt()
        var minutes = correctMinutes - currentMinutes
        count += minutes / 60
        minutes %= 60
        count += minutes / 15
        minutes %= 15
        count += minutes / 5
        minutes %= 5
        count += minutes
        return count
    }
}

fun main() {
    val obj = MinimumNumberOfOperationsToConvertTime()
    println(obj.convertTime("00:00", "23:59"))
    println(obj.convertTime("02:30", "04:35"))
    println(obj.convertTime("11:00", "11:01"))
}