package com.codelabs.leetcodeproject.easy

class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (magazine.length < ransomNote.length) return false
        val ran = ransomNote.groupBy { it }
        val mag = magazine.groupBy { it }
        if (mag.size < ran.size) return false
        ran.forEach {
            if (mag[it.key] == null) {
                return false
            } else {
                if (mag[it.key]?.size!! < it.value.size)
                    return false
            }
        }
        return true
    }
}

fun main() {
    val obj = RansomNote()
    println(obj.canConstruct("a", "b"))
    println(obj.canConstruct("aa", "ab"))
    println(obj.canConstruct("aa", "aab"))
}