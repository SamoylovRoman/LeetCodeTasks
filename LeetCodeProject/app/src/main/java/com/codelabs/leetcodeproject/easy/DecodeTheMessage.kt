package com.codelabs.leetcodeproject.easy

class DecodeTheMessage {
    fun decodeMessage(key: String, message: String): String {
        val codeString =
            key.groupBy { it }.keys.joinToString("").replace(" ", "", ignoreCase = false)
        var decodedMessage = ""
        message.forEach { c ->
            decodedMessage += if (c == ' ') {
                ' '
            } else {
                (codeString.indexOfFirst { it == c } + 97).toChar()
            }
        }
        return decodedMessage
    }
}

fun main() {
    val obj = DecodeTheMessage()
    println(obj.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"))
}