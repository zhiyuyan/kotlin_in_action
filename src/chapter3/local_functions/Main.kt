package chapter3.local_functions

fun main(args: Array<String>) {
    saveUser(User(1, "aa", ""))
}

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    fun validate(value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Cannot save user ${user.id}: $fieldName is empty")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}