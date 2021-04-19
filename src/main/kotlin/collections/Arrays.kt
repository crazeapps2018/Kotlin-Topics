package collections

fun main(args: Array<String>) {

    // Arrays Tutorial

    //Elements:  32  0  0  54  0
    //Index:     0   1  2   3  4

    val list = listOf("Yogi", "Manmohan", "Vajpayee") // Immutable Fixed, READ ONLY



    for (element in list) {
        println(element)
    }

    println()

    for (index in 0..list.size - 1) {
        println(list[index])
    }

}