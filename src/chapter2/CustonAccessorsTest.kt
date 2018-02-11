package chapter2

fun main(args: Array<String>) {
    var alpha = Alpha("Bob", true)
    println(alpha.isMarried)
    alpha.isMarried = true
    println(alpha.isMarried)
}

class Alpha(val name: String, _isMarried: Boolean) {

    var isMarried: Boolean = false

    set(value) {
        field = !value
    }

    init {
        isMarried = _isMarried
    }
}