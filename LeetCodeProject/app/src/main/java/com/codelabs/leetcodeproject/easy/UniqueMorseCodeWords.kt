package com.codelabs.leetcodeproject.easy

class UniqueMorseCodeWords {
    private val morseAlphabet = listOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    fun uniqueMorseRepresentations2(words: Array<String>): Int {
        val arr = Array(words.size) { "" }
        words.forEachIndexed { index, s ->
            s.forEach { ch ->
                arr[index] += morseAlphabet[ch.toInt() - 97]
            }
        }
        return arr.groupBy { it }.size
    }

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        return words.map { it.map { ch -> morseAlphabet[ch - 'a'] }.joinToString("") }.toSet().size
    }
}

fun main() {
    val obj = UniqueMorseCodeWords()
    println(obj.uniqueMorseRepresentations(arrayOf("gin", "zen", "gig", "msg")))
    println(obj.uniqueMorseRepresentations(arrayOf("a")))
}