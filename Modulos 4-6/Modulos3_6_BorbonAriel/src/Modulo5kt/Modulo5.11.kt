package Modulo5kt

open class BaseBuildingMaterial11(val numberNeeded: Int = 1)

class Wood11 : BaseBuildingMaterial11(4)
class Brick11 : BaseBuildingMaterial11(8)

//la t es generico, acepta lo que sea siempre y cuando sea heredador de BaseBuildingMaterial11
class Building11<T : BaseBuildingMaterial11>(val material: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} Necesarios")
    }
}
fun main() {

    val woodBuilding = Building11(Wood11())
    woodBuilding.build()

    val brickBuilding = Building11(Brick11())
    brickBuilding.build()
}