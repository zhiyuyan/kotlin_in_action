package chapter4

import chapter2.Person

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        println("calculateSalary")
    }
}

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("jjj", true))
    Payroll.calculateSalary()
    println(Payroll)

    println(B)

    println(Userr.newSubscribingUser("1111@qa").nickname)
    println(Userr.newFacebookUser(1222).nickname)
}

open class A(val name: String)

object B : A("aaa")

class Userr(val nickname: String) {

    companion object {

        fun newSubscribingUser(email: String) = Userr(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) = Userr(accountId.toString())

    }

}