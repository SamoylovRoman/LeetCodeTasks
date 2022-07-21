package com.codelabs.leetcodeproject.easy

class ValidParentheses {
    fun isValid(s: String): Boolean {
        var flag = true
        val stack = mutableListOf<Char>()
        s.forEach {
            when (it) {
                '(' -> stack.add(0, it)
                ')' -> if (stack.isEmpty()) {
                    flag = false
                    return@forEach
                } else {
                    if (stack[0] == '(') {
                        stack.removeAt(0)
                    } else {
                        flag = false
                        return@forEach
                    }
                }
                '{' -> stack.add(0, it)
                '}' -> if (stack.isEmpty()) {
                    flag = false
                    return@forEach
                } else {
                    if (stack[0] == '{') {
                        stack.removeAt(0)
                    } else {
                        flag = false
                        return@forEach
                    }
                }
                '[' -> stack.add(0, it)
                ']' -> if (stack.isEmpty()) {
                    flag = false
                    return@forEach
                } else {
                    if (stack[0] == '[') {
                        stack.removeAt(0)
                    } else {
                        flag = false
                        return@forEach
                    }
                }
            }
        }
        return flag && stack.isEmpty()
    }
}

fun main() {
    val obj = ValidParentheses()
    println(obj.isValid("]"))
    println(obj.isValid("()"))
    println(obj.isValid("{[]}")) //true
    println(obj.isValid("()[]{}"))
    println(obj.isValid("(]"))
    println(obj.isValid("([)]"))
}