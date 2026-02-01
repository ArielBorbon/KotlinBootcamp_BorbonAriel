package Modulo5kt

open class BaseBuildingMaterial16(val numberNeeded: Int = 1)
class Wood16 : BaseBuildingMaterial16(4)
class Brick16 : BaseBuildingMaterial16(8)

class Building16<out T : BaseBuildingMaterial16>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded
}

fun <T : BaseBuildingMaterial16> isSmallBuilding(building: Building16<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Construccion Chica")
    } else {
        println("Construccion Grande")
    }
}

fun main() {
    val buildingWood = Building16(Wood16())
    isSmallBuilding(buildingWood)

    val buildingBrick = Building16(Brick16())
    isSmallBuilding(buildingBrick)
}