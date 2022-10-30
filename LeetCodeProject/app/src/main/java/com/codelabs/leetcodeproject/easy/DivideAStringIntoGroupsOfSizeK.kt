package com.codelabs.leetcodeproject.easy

class DivideAStringIntoGroupsOfSizeK {
    fun divideString2(s: String, k: Int, fill: Char): Array<String> {
        val list = s.chunked(k).toMutableList()
        if (list[list.lastIndex].length < k) {
            var newStr = list[list.lastIndex]
            var index = list[list.lastIndex].length - 1
            while (index < k - 1) {
                newStr += fill
                index++
            }
            list[list.lastIndex] = newStr
        }
        return list.toTypedArray()
    }

    fun divideString(s: String, k: Int, fill: Char) = s.chunked(k) { it.padEnd(k, fill).toString() }

}

fun main() {
    val obj = DivideAStringIntoGroupsOfSizeK()
    obj.divideString("abcdefghi", 3, 'x').forEach { print("$it ") }
    println()
    obj.divideString("abcdefghij", 3, 'x').forEach { print("$it ") }
    println()
}