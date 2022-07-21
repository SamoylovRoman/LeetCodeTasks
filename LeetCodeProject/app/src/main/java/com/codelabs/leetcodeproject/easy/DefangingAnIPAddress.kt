package com.codelabs.leetcodeproject.easy

class DefangingAnIPAddress {
    fun defangIPaddr(address: String): String {
        return address.split('.').joinToString("[.]")
    }
}

fun main() {
    val obj = DefangingAnIPAddress()
    println(obj.defangIPaddr("1.1.1.1"))
    println(obj.defangIPaddr("255.100.50.0"))
}