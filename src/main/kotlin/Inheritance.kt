

/*By default:
 - 'public'
 - 'final'

For inheritance you need to make a class 'open'

Types of Inheritance

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchial Inheritance

All the classes in kotlin have one super class name as 'Any'

"Any" class contains functions such as:
 -> equals(): Boolean
 -> hashCode():Int
 -> toString():String
*/

fun main(args:Array<String>){

    var dog = Dog()
    dog.breed = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()


}

open class Animal(){
    var color: String = ""
    fun eat(){
        println("Eat")
    }
}

class Dog: Animal() {


    var breed: String = ""

    fun bark(){
        println("Bark")
    }


}

class Cat: Animal() {


    var age:Int = -1

    fun meow(){
        println("meow")

    }

}