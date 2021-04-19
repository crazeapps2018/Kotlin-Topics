package withapply

fun main(args: Array<String>) {

    var person = Person()

    with(person) {
        name = "Dharamveer"
        age = 30
        startRun()
    }

    person.apply {
        name = "More singh"
        age = 23

    }.startRun()

    println(person.name)
    println(person.age)


}
class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun(){
        println("Now I am ready to run")
    }
}