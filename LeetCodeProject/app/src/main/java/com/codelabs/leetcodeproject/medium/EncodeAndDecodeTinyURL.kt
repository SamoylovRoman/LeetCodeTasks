package com.codelabs.leetcodeproject.medium

class EncodeAndDecodeTinyURL {

    private val longUrlsMap = HashMap<String, String>()
    private val shortUrlsMap = HashMap<String, String>()
    private val encodeString = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890"

    fun encode(longUrl: String): String {
        if (longUrlsMap[longUrl] != null) return longUrlsMap[longUrl]!!
        var str = ""
        for (i in 0..5) {
            str += encodeString.random()
        }
        longUrlsMap[longUrl] = "http://tinyurl.com/$str"
        shortUrlsMap[longUrlsMap[longUrl]!!] = longUrl
        return longUrlsMap[longUrl]!!
    }

    fun decode(shortUrl: String): String {
        return shortUrlsMap[shortUrl]!!
    }
}

fun main() {
    val obj = EncodeAndDecodeTinyURL()
    val shortURL = obj.encode("https://leetcode.com/problems/design-tinyurl")
    val longURL = obj.decode(shortURL)
    println(shortURL)
    println(longURL)
}