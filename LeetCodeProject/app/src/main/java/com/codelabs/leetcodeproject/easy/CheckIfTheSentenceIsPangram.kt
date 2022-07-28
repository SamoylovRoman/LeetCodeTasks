package com.codelabs.leetcodeproject.easy

class CheckIfTheSentenceIsPangram {
    fun checkIfPangram(sentence: String): Boolean {
//        return sentence.toSortedSet().joinToString("") == "abcdefghijklmnopqrstuvwxyz"
        (97..122).forEach {
            if (!sentence.contains(it.toChar())) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val obj = CheckIfTheSentenceIsPangram()
    println(obj.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
    println(obj.checkIfPangram("leetcode"))
}