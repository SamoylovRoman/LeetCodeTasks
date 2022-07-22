package com.codelabs.leetcodeproject.easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class RootEqualsSumOfChildren {
    fun checkTree(root: TreeNode?): Boolean {
        return root?.`val` == root?.left?.`val`?.plus(root.right?.`val`!!)
    }
}

fun main() {

}