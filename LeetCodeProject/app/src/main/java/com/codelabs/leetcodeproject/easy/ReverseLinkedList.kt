package com.codelabs.leetcodeproject.easy

class ReverseLinkedList {
    fun reverseList(head: ListNode2?): ListNode2? {
        if (head == null) return null
        var cur= head
        var prev: ListNode2? = null
        while (cur != null) {
            val tmp  = cur.next
            cur.next = prev
            prev = cur
            cur= tmp
        }
        return prev
    }
}

class ListNode2(var `val`: Int) {
    var next: ListNode2? = null
}

fun main() {
    val li = ListNode2(5)
    var v = li.`val`
}