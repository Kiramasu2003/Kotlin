package seccionDos

fun main(){
    var holamundo= arrayListOf<String>("hola", "adios", "no tengo novia")

    var palabra = readLine().toString()
    //primero analiza si se cumple la condición para ejecutar codigo
    while (palabra != ""){
        holamundo.add(palabra)
        println("palabra: ")
        palabra = readLine().toString()

    }

    println("Soy un separador, Me presentas a una amiga tuya?")

    for (hola in holamundo) println(hola)
     //Minimo se ejecuta una vez, primero ejecuta codigo, luego analiza
    //si se cumple la condición
    do{
        holamundo.add(palabra)
        println("palabra: ")
        palabra = readLine().toString()

    }while (palabra !="")

    for (hola in holamundo) println(hola)
}