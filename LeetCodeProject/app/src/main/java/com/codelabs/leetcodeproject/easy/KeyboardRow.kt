package com.codelabs.leetcodeproject.easy

class KeyboardRow {
    fun findWords(words: Array<String>): Array<String> {
        return words.filter { it.map { keyboard[it] }.toSet().size == 1 }.toTypedArray()
    }

    companion object {
        val keyboard = hashMapOf(
            'Q' to 1,
            'q' to 1,
            'W' to 1,
            'w' to 1,
            'E' to 1,
            'e' to 1,
            'R' to 1,
            'r' to 1,
            'T' to 1,
            't' to 1,
            'Y' to 1,
            'y' to 1,
            'U' to 1,
            'u' to 1,
            'I' to 1,
            'i' to 1,
            'O' to 1,
            'o' to 1,
            'P' to 1,
            'p' to 1,
            'A' to 2,
            'a' to 2,
            'S' to 2,
            's' to 2,
            'D' to 2,
            'd' to 2,
            'F' to 2,
            'f' to 2,
            'G' to 2,
            'g' to 2,
            'H' to 2,
            'h' to 2,
            'J' to 2,
            'j' to 2,
            'K' to 2,
            'k' to 2,
            'L' to 2,
            'l' to 2,
            'Z' to 3,
            'z' to 3,
            'X' to 3,
            'x' to 3,
            'C' to 3,
            'c' to 3,
            'V' to 3,
            'v' to 3,
            'B' to 3,
            'b' to 3,
            'N' to 3,
            'n' to 3,
            'M' to 3,
            'm' to 3
        )
    }
}

fun main() {
    val obj = KeyboardRow()
    obj.findWords(arrayOf("Hello", "Alaska", "Dad", "Peace")).forEach { print("$it ") }
    println()
    obj.findWords(arrayOf("omk")).forEach { print("$it ") }
    println()
    obj.findWords(arrayOf("adsdf", "sfd")).forEach { print("$it ") }
    println()
}