package chapter3.collections

fun main(args: Array<String>) {
    val set = setOf(1, 7, 35)
    val list = listOf(1, 7, 35)
    val map = mapOf(1 to "one", 7 to "seven", 35 to "thirty-five")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}