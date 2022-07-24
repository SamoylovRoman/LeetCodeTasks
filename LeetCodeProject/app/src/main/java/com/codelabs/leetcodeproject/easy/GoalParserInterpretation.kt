package com.codelabs.leetcodeproject.easy

class GoalParserInterpretation {
    fun interpret(command: String): String {
        var str = ""
        var index = 0
        while (index < command.length) {
            when (command[index]) {
                'G' -> {
                    str += 'G'
                    index++
                }
                '(' -> {
                    if (command[index + 1] == ')') {
                        str += 'o'
                        index += 2
                    } else {
                        str += "al"
                        index += 4
                    }
                }
            }
        }
        return str
    }
}

fun main() {
    val obj = GoalParserInterpretation()
    println(obj.interpret("G()(al)"))
    println(obj.interpret("G()()()()(al)"))
    println(obj.interpret("(al)G(al)()()G"))
}