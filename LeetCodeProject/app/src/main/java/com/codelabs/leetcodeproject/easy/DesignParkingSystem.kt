package com.codelabs.leetcodeproject.easy

class ParkingSystem(var big: Int, var medium: Int, var small: Int) {

    fun addCar(carType: Int): Boolean {
        when (carType) {
            1 -> {
                if (big == 0) return false
                else big--
            }
            2 -> {
                if (medium == 0) return false
                else medium--
            }
            3 -> {
                if (small == 0) return false
                else small--
            }
        }
        return true
    }

}

fun main() {
    val parkSystem = ParkingSystem(1, 1, 0)
    println(parkSystem.addCar(1))
    println(parkSystem.addCar(2))
    println(parkSystem.addCar(3))
    println(parkSystem.addCar(1))
}

