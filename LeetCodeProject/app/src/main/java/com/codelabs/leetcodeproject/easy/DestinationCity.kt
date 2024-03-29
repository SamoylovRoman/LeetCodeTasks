package com.codelabs.leetcodeproject.easy

class DestinationCity {
    fun destCity(paths: List<List<String>>): String {
        var clCity = ""
        val startCities = paths.map { it[0] }
        paths.map { it[1] }.forEach {
            if (!startCities.contains(it)) {
                clCity = it
                return@forEach
            }
        }
        return clCity
    }

    fun destCity2(paths: List<List<String>>): String {
        val startCities = paths.map { it[0] }
        return paths.map { it[1] }.filter { it !in startCities }[0]
    }

    fun destCity3(paths: List<List<String>>): String {
        val startCities = paths.map { it[0] }
        val finishCities = paths.map { it[1] }
        return (finishCities - startCities)[0]
    }
}

fun main() {
    val obj = DestinationCity()
    println(
        obj.destCity(
            listOf(
                listOf("London", "New York"),
                listOf("New York", "Lima"),
                listOf("Lima", "Sao Paulo")
            )
        )
    )
    println(
        obj.destCity(
            listOf(
                listOf("B", "C"),
                listOf("D", "B"),
                listOf("C", "A")
            )
        )
    )
    println(
        obj.destCity(
            listOf(
                listOf("A", "Z")
            )
        )
    )
}