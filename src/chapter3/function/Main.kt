package chapter3.function

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)

    // 命名参数：named arguments
    println(joinToString(collection = list, separator = ";", prefix = "{", postfix = "}"))

    // 默认参数：default parameter values
    println(joinToString(collection = list))

    // 扩展函数
    println("Kotlin".lastChar())

    // 扩展函数不能被覆写
    val view: View = Button()
    view.click() // 输出：Button clicked
    view.showOff() // 输出：I'm a view!
}

fun <T> joinToString(
        collection: Collection<T>,
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()

}

fun String.lastChar(): Char = this.get(this.length - 1)

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

