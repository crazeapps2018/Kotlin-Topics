package lambdas_higerorderfunctions


fun main(args: Array<String>) {

    val lambdas = Lambdas()
    var result = 0

    //val myLambda: (Int,Int) -> Int = { x: Int,y: Int -> x + y } // Lambda expression [Function]
    //lambdas.addTwoNumbers(2,7,{x , y -> x + y}) // Lambda expression [Function]
    lambdas.addTwoNumbers(2,7) { x, y -> result = x + y }
    println(result)

}


class Lambdas {

    fun addTwoNumbers  (a: Int, b: Int,action: (Int, Int) -> Unit) {  //High Level Function with Lambda as parameter

        val result = action(a,b)

       // println(result)
    }

    fun addTwoNumbers  (a: Int, b: Int,action: MyInterface) { // Using Interface / Object Oriented Way

        val sum = a + b
        action.execute(sum)


    }

    fun addTwoNumbers  (a: Int, b: Int) { //Simple way.. Just for better understanding

        val sum = a + b
        println(sum)

    }
}
interface MyInterface {
    fun execute(sum:Int)
}