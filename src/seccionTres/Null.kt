package seccionTres

//var text: String? =null  Esto sirve para manejar el valor Null en nuestra variables

fun main(){

    try {
    val entrada= readLine()
    //val lado = if (entrada!=null)entrada.toDouble() else 0.0
    val lado = entrada?.toDouble()?: 0.0
    val res =lado*lado

    println(res)
    }catch (e: Exception){
        println("Entrada no valida")
    }

    val entrada= readLine()

    val lado = entrada?.toDoubleOrNull()?: 0.0
    val res =lado*lado

    println(res)

    var entradita = readLine()

    val ladito=entradita?.toDoubleOrNull()

    //it es una variable local de la funcion
    ladito?.let {
        val resultado = it * it
        println(resultado)
    }

    println("Fin")


}