package seccionDos

fun main(){
    //el when es como el switch en Java
    val valor= readLine()!!.toInt()

    when(valor){
        /*Al igual que el if-else, si la opción solo tiene una sola linea de codigo
        * entonces no es necesario poner { }
        * pero si son más lineas
        *
        * when(valor){
        *   1-> {
        *       println("SISISISI")
        *       println("nonononono")
        *     }
        *   ...
        *   }
        *
        *
        * */
        1-> println("Hola, Soy Goku")
        2-> println("Ya me voy Cerdo, te vere más tarde")
        else -> println("GG")
    }
    //Obviamente Any es para decir, es "puede ser cualquier tipo de dato"
    //val valor2: Any = 1
    val valor2: Any = readLine()!!
    when(valor2){
        //el is sirve para saber que tipo de dato es el valor2
        is String-> println("xd")
        is Char-> println("xd'nt")
        is Byte-> println("a")
        is Short-> println("A")
        is Int-> println("xD")
        is Long-> println("Oh")
        is Double-> println("Xd")
        is Float-> println("Alá")
        is Boolean-> println("XD")
        else-> println("Porqué hice tantas lineas de código?")
    }

}