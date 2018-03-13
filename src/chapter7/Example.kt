package chapter7

class Example {

    var p: String by Delegate()

}

fun main(vargs: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "aaaaa"
    println(e.p)
    println(lazyValue)
    println(lazyValue)
}

val lazyValue: String by lazy {
    println("computed")
    "hello"
}