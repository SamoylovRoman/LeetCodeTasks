package com.codelabs.leetcodeproject.easy

class DecodeXORedArray {
    fun decode(encoded: IntArray, first: Int): IntArray {
        val array = IntArray(encoded.size + 1)
        array[0] = first
        encoded.forEachIndexed { index, i ->
            array[index + 1] = i xor array[index]
        }
        return array
    }
}

fun main() {
    val obj = DecodeXORedArray()
    obj.decode(intArrayOf(1, 2, 3), 1).forEach {
        print("$it ")
    }
    println()
    obj.decode(intArrayOf(6, 2, 7, 3), 4).forEach {
        print("$it ")
    }
    println()
}