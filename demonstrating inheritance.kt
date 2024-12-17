package test

open class Animal {
    open fun makeSound() {
        println("Some animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof Woof")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow Meow")
    }
}

fun main() {
    var dog = Dog()
    var cat = Cat()

    dog.makeSound()
    cat.makeSound()
}
