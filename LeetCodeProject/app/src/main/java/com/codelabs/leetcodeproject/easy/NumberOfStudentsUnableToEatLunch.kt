package com.codelabs.leetcodeproject.easy

class NumberOfStudentsUnableToEatLunch {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val studentsList = students.toMutableList()
        val sandwichesList = sandwiches.toMutableList()
        var count = 0
        while (studentsList.isNotEmpty()) {
            if (studentsList.first() == sandwichesList.first()) {
                studentsList.removeAt(0)
                sandwichesList.removeAt(0)
                count++
                continue
            }
            studentsList.add(studentsList.first())
            studentsList.removeAt(0)
            if (!studentsList.contains(sandwichesList.first())) {
                break
            }
        }
        return students.size - count
    }
}

fun main() {
    val obj = NumberOfStudentsUnableToEatLunch()
    println(obj.countStudents(intArrayOf(1, 1, 0, 0), intArrayOf(0, 1, 0, 1)))
    println(obj.countStudents(intArrayOf(1, 1, 1, 0, 0, 1), intArrayOf(1, 0, 0, 0, 1, 1)))
}