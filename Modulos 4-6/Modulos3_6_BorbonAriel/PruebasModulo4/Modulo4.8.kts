
open class Book(
    val title: String,
    val author: String
)

{

    private var currentPage = 0

    open fun readPage() {
        currentPage++
        println("Leída una página del libro $title. Página actual: $currentPage")
    }
}

class eBook(
    title: String,
    author: String,
    var format: String = "text"
)   : Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
        println("Leídas 250 palabras del eBook $title. Total palabras: $wordCount")
    }
}

