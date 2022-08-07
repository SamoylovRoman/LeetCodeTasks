package com.codelabs.leetcodeproject.easy

class NumberOfStudentsDoingHomeworkAtAGivenTime {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int) =
        startTime.filterIndexed { index, i -> queryTime in i..endTime[index] }.count()
}

fun main() {
    val obj = NumberOfStudentsDoingHomeworkAtAGivenTime()
    println(obj.busyStudent(intArrayOf(1, 2, 3), intArrayOf(3, 2, 7), 4))
    println(obj.busyStudent(intArrayOf(4), intArrayOf(4), 4))
}