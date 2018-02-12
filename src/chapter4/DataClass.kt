package chapter4

class Client(val name: String, val postalCode: Int)

data class DataClient(val name: String, val postalCode: Int) {
    var address: String = "afad"
}

fun main(args: Array<String>) {

    val client1 = Client("Bob", 1111)
    val client2 = Client("Bob", 1111)
    println(client1.toString())
    println(client1 == client2)
    println(client1.hashCode())
    println(client1.hashCode())

    println()

    val dataClient1 = DataClient("Bob", 1111)
    dataClient1.address = "a"
    val dataClient2 = DataClient("Bob", 1111)
    dataClient2.address = "b"
    println(dataClient1.toString())
    println(dataClient1 == dataClient2)
    println(dataClient1.hashCode())
    println(dataClient2.hashCode())

}