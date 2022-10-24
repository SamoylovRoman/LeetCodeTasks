package com.codelabs.leetcodeproject.easy

class UncommonWordsFromTwoSentences {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        return "$s1 $s2".split(' ').groupBy { it }
            .filter { it.value.size == 1 }.keys.toTypedArray()
//        val map1 = mutableMapOf<String, Int>()
//        s1.split(' ').forEach { s ->
//            if (map1[s] == null) {
//                map1[s] = 1
//            } else {
//                map1[s] = map1[s]!! + 1
//            }
//        }
//        val map2 = mutableMapOf<String, Int>()
//        s2.split(' ').forEach { s ->
//            if (map2[s] == null) {
//                map2[s] = 1
//            } else {
//                map2[s] = map2[s]!! + 1
//            }
//        }
//        val list = mutableListOf<String>()
//        map1.forEach { entry ->
//            if (entry.value == 1 && !map2.contains(entry.key)) {
//                list.add(entry.key)
//            }
//        }
//        map2.forEach { entry ->
//            if (entry.value == 1 && !map1.contains(entry.key)) {
//                list.add(entry.key)
//            }
//        }
//        return list.toTypedArray()
    }
}

fun main() {
    val obj = UncommonWordsFromTwoSentences()
    obj.uncommonFromSentences("this apple is sweet", "this apple is sour")
        .forEach { print("$it  ") }
    println()
    obj.uncommonFromSentences("apple apple", "banana").forEach { print("$it  ") }
    println()
}