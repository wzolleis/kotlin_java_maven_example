package org.example

class KotlinService {
    fun sayHelloTo(name: String): String {
        println("call java from Kotlin -> " + JavaService().sayHelloTo(name))
        return "Hi ${name}, you are calling a Kotlin Service"
    }
}