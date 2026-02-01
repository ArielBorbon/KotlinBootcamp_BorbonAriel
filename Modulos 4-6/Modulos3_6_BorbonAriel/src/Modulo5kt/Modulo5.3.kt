package Modulo5kt


class Book(
    val title: String,
    val author: String,
    val year: Int
    )
{

    fun getTitleAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book = Book("El Principito", "Antoine de Saint-Exupéry", 1943)

    val bookInfo = book.getTitleAuthorYear()

    println("Libro loco: ${bookInfo.first} Escrito por el mismisimo ${bookInfo.second} en ${bookInfo.third}.")
}