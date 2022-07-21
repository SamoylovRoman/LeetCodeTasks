package com.codelabs.leetcodeproject.easy

class AddBinary {
    fun addBinary(a: String, b: String): String {
        val maxCount = Math.max(a.length, b.length)
        val masA = CharArray(maxCount + 1) { '0' }
        val masB = CharArray(maxCount + 1) { '0' }
        var tmpIndex = maxCount
        for (i in a.length - 1 downTo 0) {
            masA[tmpIndex] = a[i]
            tmpIndex--
        }
        tmpIndex = maxCount
        for (i in b.length - 1 downTo 0) {
            masB[tmpIndex] = b[i]
            tmpIndex--
        }
        tmpIndex = maxCount
        var str = ""
        var addOne = false
        while (tmpIndex != -1) {
            when {
                masA[tmpIndex] == '0' && masB[tmpIndex] == '0' && !addOne -> str += '0'
                masA[tmpIndex] == '0' && masB[tmpIndex] == '0' && addOne -> {
                    str += '1'
                    addOne = false
                }
                masA[tmpIndex] == '1' && masB[tmpIndex] == '1' && !addOne -> {
                    str += '0'
                    addOne = true
                }
                masA[tmpIndex] == '1' && masB[tmpIndex] == '1' && addOne -> {
                    str += '1'
                    addOne = true
                }
                (masA[tmpIndex] == '1' || masB[tmpIndex] == '1') && !addOne -> str += '1'
                (masA[tmpIndex] == '1' || masB[tmpIndex] == '1') && addOne -> {
                    str += '0'
                    addOne = true
                }

            }
            tmpIndex--
        }
        if (str.last() == '0') {
            return str.dropLast(1).reversed()
        }
        return str.reversed()
    }
}

fun main() {
    val obj = AddBinary()
    println(obj.addBinary("100", "10111"))
    println(obj.addBinary("11", "1"))
    println(obj.addBinary("1010", "1011"))

}