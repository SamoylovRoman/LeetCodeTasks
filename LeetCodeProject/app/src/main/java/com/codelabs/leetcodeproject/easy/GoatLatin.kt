package com.codelabs.leetcodeproject.easy

class GoatLatin {

    val string1 = "aeiouAEIOU"
    val string2 = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNMyY"

    fun toGoatLatin(sentence: String): String {
        val arr = sentence.split(" ")
        val newList = mutableListOf<String>()
        for (i in 0..arr.lastIndex) {
            var newStr = ""
            when {
                string2.contains(arr[i][0]) -> {
                    newStr += arr[i].substring(1)
                    newStr += (arr[i][0] + "ma")
                }
                string1.contains(arr[i][0]) -> {
                    newStr = arr[i] + "ma"
                }
            }
            for (j in 0..i) {
                newStr += 'a'
            }
            newList.add(newStr)
        }
        return newList.joinToString(" ")
    }
}

fun main() {
    val obj = GoatLatin()
    println(obj.toGoatLatin("yDumm"))
    println(obj.toGoatLatin("I speak Goat Latin"))
    println(obj.toGoatLatin("The quick brown fox jumped over the lazy dog"))
}