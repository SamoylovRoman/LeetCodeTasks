package com.codelabs.leetcodeproject.easy

class MaximumUnitsOnATruck {
    fun maximumUnits2(boxTypes: Array<IntArray>, truckSize: Int): Int {
        val map = mutableMapOf<Int, Int>().toSortedMap(reverseOrder())
        var size = truckSize
        var sum = 0
        boxTypes.forEach {
            if (map[it[1]] == null) map[it[1]] = it[0]
            else map[it[1]] = map[it[1]]?.plus(it[0])
        }
        map.forEach { println(it) }
        map.forEach {
            while (size > 0 && it.value != 0) {
                size--
                sum += it.key
                map[it.key] = it.value - 1
            }
        }
        return sum
    }

    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        boxTypes.sortWith(compareByDescending { it[1] })
        var size = truckSize
        var sum = 0
        for (i in boxTypes.indices) {
            if (boxTypes[i][0] > size) {
                sum += size * boxTypes[i][1]
                return sum
            } else {
                sum += boxTypes[i][0] * boxTypes[i][1]
                size -= boxTypes[i][0]
            }
        }
        return sum
    }
}

fun main() {
    val obj = MaximumUnitsOnATruck()
    println(obj.maximumUnits(arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(3, 1)), 4))
    println(
        obj.maximumUnits(
            arrayOf(
                intArrayOf(5, 10),
                intArrayOf(2, 5),
                intArrayOf(4, 7),
                intArrayOf(3, 9)
            ), 10
        )
    )
}