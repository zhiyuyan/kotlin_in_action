package chapter5

import chapter2.Person

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val people = listOf(Person("Alice", true), Person("Bob", false))
    println(people.maxBy { it.name })
    println(people.maxBy(Person::name))

    fun printMessage() = printMessagesWithPrefix(errors, "Error:")
    run(::printMessage)

    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })
    println(list.all { it > 2 })
    println(list.any { it > 2 })
    println(list.count { it > 2 })

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {

    messages.forEach { println("$prefix $it") }

}