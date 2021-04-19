package lambdas_higerorderfunctions

fun main(args:Array<String>){

    val itDefine = ItDefine()
    itDefine.reverseAndDisplay("hello") { it.reversed() }
}

class ItDefine {

    fun reverseAndDisplay(str:String, myFunc: (String) -> String) {

        val result = myFunc(str) // it.reversed() ===> str.reversed() ====> "hello".reversed() = "olleh"
        println(result)
    }
}