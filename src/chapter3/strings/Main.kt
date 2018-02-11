package chapter3.strings

fun main(args: Array<String>) {
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePathRegexp("/Users/yole/kotlin-book/chapter.adoc")
}

fun parsePath(path: String) {

    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext:$extension")

}

fun parsePathRegexp(path: String) {

    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext:$extension")
    }

}