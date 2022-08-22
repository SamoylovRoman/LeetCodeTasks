package com.codelabs.leetcodeproject.easy

class RemoveAllAdjacentDuplicatesInString {
    fun removeDuplicates(s: String): String {
        val list = mutableListOf<Char>()
        s.forEach { ch ->
            if (list.isNotEmpty() && list.last() == ch) {
                list.removeAt(list.size - 1)
            } else {
                list.add(ch)
            }
        }
        return list.joinToString("")
    }
}

fun main() {
    val obj = RemoveAllAdjacentDuplicatesInString()
    println(obj.removeDuplicates("abbaca"))
    println(obj.removeDuplicates("azxxzy"))
}