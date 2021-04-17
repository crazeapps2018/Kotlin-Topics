package object_declaration

fun main(args:Array<String>){

    CustomersData.count = 98
    CustomersData.typeOfCustomers()

}


object CustomersData {

    var count: Int = 1

    fun typeOfCustomers():String {
        return "Indian"
    }

}