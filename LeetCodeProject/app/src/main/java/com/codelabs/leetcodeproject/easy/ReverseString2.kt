package com.codelabs.leetcodeproject.easy

class ReverseString2 {
    fun reverseStr2(s: String, k: Int): String {
        var newStr: String = ""
        s.chunked(k).forEachIndexed { index, s ->
            newStr += if (index % 2 == 0) {
                s.reversed()
            } else {
                s
            }
        }
        return newStr
    }

    fun reverseStr(s: String, k: Int): String {
        val arr = s.toCharArray()
        var tmp: Char
        var index: Int
        for (i in arr.indices step 2 * k) {
            index = i
            var j = minOf(i + k -1, arr.size -1)
            while (index < j) {
                tmp = arr[index]
                arr[index++] = arr[j]
                arr[j--]  = tmp
            }
        }
        arr.forEach {
            print(it)
        }
        println()
        return arr.joinToString("")
    }
}

fun main() {
    val obj = ReverseString2()
    println(obj.reverseStr("abcdefg", 2))
    println(obj.reverseStr("abcd", 4))
    println(obj.reverseStr("a", 2))
}