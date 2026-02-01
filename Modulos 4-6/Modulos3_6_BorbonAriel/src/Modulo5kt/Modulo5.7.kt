package Modulo5kt

const val MAX_NUMBER_BOOKS7 = 3

class Book7(val title: String, val author: String) {

    companion object {
        const val BASE_URL = "http://www.libreria.com/"
    }
    fun canBorrow(userBooksCount: Int): Boolean {
        return userBooksCount < MAX_NUMBER_BOOKS7
    }

    fun printUrl() {
        println("URL del libro: $BASE_URL$title.html")
    }
}
fun main() {
    val myBook = Book7("KotlinBootCamp", "Ariels")

    val booksIHave = 2
    println("¿Puedo tomar prestado otro libro si tengo $booksIHave ? ${myBook.canBorrow(booksIHave)}")

    val booksIHaveTooMany = 4
    println("¿Puedo tomar prestado otro libro si tengo $booksIHaveTooMany ? ${myBook.canBorrow(booksIHaveTooMany)}")

    myBook.printUrl()
}