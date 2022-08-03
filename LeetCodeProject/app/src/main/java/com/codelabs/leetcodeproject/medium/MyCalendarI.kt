package com.codelabs.leetcodeproject.medium

import java.util.*

class MyCalendarI {

    private val eventsMap = TreeMap<Int, Int>()

    fun book(start: Int, end: Int): Boolean {
        val lower = eventsMap.floorEntry(start)?.value
        val higher = eventsMap.ceilingEntry(start)?.key
        if (lower == null || lower <= start) {
            if (higher == null || higher >= end) {
                eventsMap[start] = end
                return true
            }
        }
        return false
    }
}

fun main() {
    val myCalender = MyCalendarI()
    println(myCalender.book(10, 20))
    println(myCalender.book(15, 25))
    println(myCalender.book(20, 30))
}