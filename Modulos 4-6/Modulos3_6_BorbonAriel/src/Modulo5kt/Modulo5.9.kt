package Modulo5kt

import kotlin.random.Random

class Book9(val title: String, var pages: Int)

fun Book9.weight(): Double {
    return pages * 1.5
}

fun Book9.tornPages(torn: Int) {
    if (pages >= torn) {
        pages -= torn
    } else {
        pages = 0
    }
}

class Puppy9 {
    fun playWithBook(book: Book9) {
        val maxPagesToTear = 50
        val torn = Random.nextInt(1, maxPagesToTear + 1).coerceAtMost(book.pages)

        book.tornPages(torn)
        println("El Puppy daño $torn paginas")
    }
}

fun main() {
    val myBook = Book9("El Señor de los Cielos", 300)
    val puppy = Puppy9()

    println("Libro inicial: ${myBook.title} con ${myBook.pages} páginas.")
    println("Peso inicial: ${myBook.weight()} gramos.")
    println()


    while (myBook.pages > 0) {
        puppy.playWithBook(myBook)
        println("   Quedan ${myBook.pages} páginas. Peso actual: ${myBook.weight()}g")
    }

    println()
    println("El libro Murio")
}