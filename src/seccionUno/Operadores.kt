package seccionUno

import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main(){
    val numUno=10
    println("numUno+10=" + numUno+10)

    val numDos=10+numUno
    println("numDos= numUno+10 = " + numDos)

    println("numUno*3= " + numUno*3)
    print("numUno*numDos =" +numUno*numDos)

    val numTres= numUno*3
    val numCuatro= numUno*numDos
    println("numTres=numUno*3= " + numTres)
    println(numCuatro)

    println(numUno/2)
    println(numUno/numCuatro)

    val numCinco = numUno/3
    val numSeis = numUno/numCuatro
    println(numCinco)
    println(numSeis)

    //El % es para obtener el residuo de una división
    println(numUno%2)
    println(numUno%numCuatro)

    val  numSiete = numUno%2
    val numOcho = numUno%numCuatro

    println(numSiete)
    println(numOcho)

    var numNueve = 10
    println("numNueve = "+numNueve)
    numNueve += 19
    println(" numNueve+19 ="+numNueve)

    numNueve -= 9
    println(numNueve)

    numNueve *= 15
    println(numNueve)

    numNueve /=2
    println(numNueve)

    numNueve %=5
    println(numNueve)

    numNueve--
    println(numNueve)

    numNueve++
    println(numNueve)

    --numNueve
    println(numNueve)

    ++numNueve
    println(numNueve)



    val valor = "5"
    val resultado = valor.toInt()+5
    print(resultado)

    //el !! sirve como "seguridad", prueba que hace cuando no introduces un número
    /*
    * .toInt() .toLong() .toShort() .toByte()
    * .toDouble() toFloat()
    * .toString() .toChar()
    * .toBoolean()
    * */
    val valor2 = readLine()!!.toInt()
    val resultado2 = valor2*2
    println(resultado2)


    val pi = 3.14159
    println(pi)
    println(round(pi))
    println(DecimalFormat("#.##").format(pi))//Experimenta con el #.# para que veas que sucede

    var numero = 3.5
    println(numero)
    println(round(numero))
    println(round(numero).toInt())
    println(floor(numero).toInt())
    println(ceil(numero).toInt())

    numero = 3.1
    println(numero)
    println(round(numero))
    println(round(numero).toInt())
    println(floor(numero).toInt())
    println(ceil(numero).toInt())
}