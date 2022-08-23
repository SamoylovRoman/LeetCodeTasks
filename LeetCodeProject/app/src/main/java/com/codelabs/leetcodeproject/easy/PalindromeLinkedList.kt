package com.codelabs.leetcodeproject.easy

class PalindromeLinkedList {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun isPalindrome(head: ListNode?): Boolean {
        val list = mutableListOf<Int>()
        var cur = head
        while (cur != null) {
            list.add(cur.`val`)
            cur = cur.next
        }
        for (i in 0 until list.size / 2) {
            if (list[i] != list[list.size - i - 1]) {
                return false
            }
        }
        return true
    }
}


fun main() {
    val obj = PalindromeLinkedList()
}