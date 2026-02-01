package Modulo6Kt

enum class Directions3 {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game3 {
    var path = mutableListOf(Directions3.START)

    val north = { path.add(Directions3.NORTH) }
    val south = { path.add(Directions3.SOUTH) }
    val east =  { path.add(Directions3.EAST) }
    val west =  { path.add(Directions3.WEST) }

    val end = {
        path.add(Directions3.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}

fun main() {
    val game = Game3()

    println(game.path)

    game.north()
    game.south()
    game.east()
    game.west()
    game.west()
    game.west()
    game.north()

    game.end()

    println(game.path)
}