package com.codelabs.leetcodeproject.easy

class CountItemsMatchingARule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        when (ruleKey) {
            "type" -> {
                return items.count {
                    it[0] == ruleValue
                }
            }
            "color" -> {
                return items.count {
                    it[1] == ruleValue
                }
            }
            "name" -> {
                return items.count {
                    it[2] == ruleValue
                }
            }
        }
        return 0
    }
}

fun main() {
    val obj = CountItemsMatchingARule()
    println(
        obj.countMatches(
            listOf(
                listOf("phone", "blue", "pixel"),
                listOf("computer", "silver", "lenovo"),
                listOf("phone", "gold", "iphone")
            ), "color", "silver"
        )
    )
}