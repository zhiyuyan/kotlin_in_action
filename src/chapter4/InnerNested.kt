package chapter4

fun main(args: Array<String>) {
    val outer = Outer()
    val inner = outer.Inner()
}

class Outer {
    inner class Inner {
        fun getOuterReference() = this@Outer
    }
}