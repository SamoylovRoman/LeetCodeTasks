package com.codelabs.leetcodeproject.easy

class UniqueEmailAddresses {
    fun numUniqueEmails(emails: Array<String>): Int {
        val set = mutableSetOf<String>()
        emails.forEach { str ->
            var localName = str.substringBefore('@')
            val domainName = str.substringAfter('@')
            localName = localName.substringBefore('+', localName)
            localName = localName.split('.').joinToString("")
            set.add("${localName}@${domainName}")
        }
        return set.size
    }
}

fun main() {
    val obj = UniqueEmailAddresses()
    println(
        obj.numUniqueEmails(
            arrayOf(
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
            )
        )
    )
    println(
        obj.numUniqueEmails(
            arrayOf(
                "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
            )
        )
    )

}
