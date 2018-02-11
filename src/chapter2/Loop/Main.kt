package chapter2.Loop

fun main(args: Array<String>) {
    for (i in 1..100 step 2) {
        print(fizzBuzz(i))
    }
    println()
    for (i in 1 until 100) {
        print(fizzBuzz(i))
    }
}

fun fizzBuzz(i : Int) =
        when {
            i % 15 == 0 -> "FizzBuzz "
            i % 3 == 0 -> "Fizz "
            i % 5 == 0 -> "Buzz "
            else -> "$i "
        }