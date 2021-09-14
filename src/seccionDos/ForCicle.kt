package seccionDos

/*
* in es palabra reservada
*
* for (variable in argumentos){
*
* codigito
* }
*
*
*Con los puntos digo, desde 0 hasta 5
* */

fun main() {
    //for muy básico
    for (x in 0..5) {
        println(x)

    }
    println("Soy una separación unu")
    val valores = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //forma no practica de acceder al array
    for (x in 0..9) {
        println(valores[x] + 1)
    }
    //con el untilo digo: desde cero, hasta el valor -1, ósea valores.size= 10, y con el until es desde 0 hasta 9(10-1)
    //esto pq el ultimo indice es 9, creo se entiende hasta esté punto
    for (x in 0 until valores.size) {
        println(valores[x] + 1)
    }

    var sumatoria = 0

    for (x in 0 until valores.size) {
        //recordando que es el +=
        sumatoria += valores[x]

    }
    //valor de la suma de todos los valores del array valores, que es 55
    println(sumatoria)
    //promedio
    println(sumatoria/valores.size)

    for (x in 0 until valores.size){
        println(valores[x])

        if (valores[x]==7){
            break

        }
    }
    println("Fin del fin, todo tiene un fin")

    //igual recorremos el array, pero no sabremos explicitamente, el indice de cada valor en el que está cada valor, al
    //menos que usemos un contador
    var conter =0
    for (valor in valores){
        println("""
            -----------------
            valor: $valor
            posición: $conter
            -----------------
        """.trimIndent())
        conter ++

    }

    println("Hola, soy un separador, vendes ricos taquitos?")

     //o mejor aún, el grandioso IDE IntelliJ IDEA, nos ofrece está opción
    for ((conter, valor) in valores.withIndex()){
    //nos pone el contador, el valor como variables, reconoce cuál es el contador, y el valor, ps como el valor de cada posición xD

        println("""
            -----------------
            valor: $valor
            posición: $conter
            -----------------
        """.trimIndent())

    }
    println("Hola, soy un separador, ya tienes mis ricos tacos de payaso?")

    //podemos cuál es el avance
    for (i in 0 until valores.size step 3){
        println(valores[i])

    }

}