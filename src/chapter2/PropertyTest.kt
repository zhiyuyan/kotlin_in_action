package chapter2

fun main(args: Array<String>) {
    var person = Person("Bob", true)
    println("The person's name is ${person.name}" )
}

class Person(val name:String, var isMarried: Boolean)