package com.codelabs.leetcodeproject.easy

class RobotReturnToOrigin {
    fun judgeCircle(moves: String): Boolean {
        //very important condition for speed
        if (moves.length % 2 != 0) return false
        var horizontal = 0
        var vertical = 0
        moves.forEach {
            when (it) {
                'L' -> horizontal--
                'R' -> horizontal++
                'U' -> vertical++
                'D' -> vertical--
            }
        }
        return horizontal == 0 && vertical == 0
    }
}

fun main() {
    val obj = RobotReturnToOrigin()
    println(obj.judgeCircle("UD"))
    println(obj.judgeCircle("LL"))
}