package com.codelabs.leetcodeproject.medium

class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val map = mutableMapOf<Int, MutableList<Int>>()
        groupSizes.forEachIndexed { index, i ->
            if (map[i] != null) {
                map[i]?.add(index)
            } else {
                map[i] = mutableListOf(index)
            }
        }
        val list = mutableListOf<List<Int>>()
        map.forEach {
            it.value.chunked(it.key).map { chunk ->
                list.add(chunk)
            }
        }
        return list
    }
}

fun main() {
    val obj = GroupThePeopleGivenTheGroupSizeTheyBelongTo()
    obj.groupThePeople(intArrayOf(3, 3, 3, 3, 3, 1, 3)).forEach { list ->
        list.forEach { print("$it ") }
        print("   ")
    }
    println()
    obj.groupThePeople(intArrayOf(2, 1, 3, 3, 3, 2)).forEach { list ->
        list.forEach { print("$it ") }
        print("   ")
    }
    println()
}