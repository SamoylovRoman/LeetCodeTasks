package com.codelabs.leetcodeproject.easy

class CountOfMatchesInTournament {
    fun numberOfMatches(n: Int): Int {
        var count = 0
        var teams = n
        while (teams != 1) {
            count += (teams / 2)
            teams = (teams / 2 + teams % 2)
        }
        return count
    }
}

fun main() {
    val obj = CountOfMatchesInTournament()
    println(obj.numberOfMatches(7))
    println(obj.numberOfMatches(14))
}