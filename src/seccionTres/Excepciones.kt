package seccionTres.img.Excepciones

import java.io.File
import java.io.FileNotFoundException

fun main(){

    println(soyNumero(readLine()!!))
    println(calcInteresPrestaEsta(readLine()!!.toDouble()))
    /*try{
        val valor1= readLine()!!.toDouble()//Recuerdas que pasaba si no ingresabas un valor que no fuera Double?
    }catch (e: Exception) {
        println("INGRESA UN VALOR DOUBLE")
        main()
    }*/



    try {
        val rep = readLine()!!.toInt()
        val texto = File("C:\\CursosKotlin\\src\\seccionTres\\Texto.txt").readLines()

        for (i in 0 until rep) println(texto)
    }catch (e: FileNotFoundException){

    //    e.printStackTrace()//esto para saber que pasó
        //necesitamos un mensaje más especifico
        println("Error")
        main()
    }catch(e: NumberFormatException ){
        println("El formato del valor debe ser un numero")
        main()
    }catch (e: Exception){
        println("ERRRRRRRRRRR--ORR : $e.localizedMessage")
        main()
    }finally {
        println("Halls")
    }
}

fun soyNumero(valor: Any): Boolean{


    return try {
        valor.toString().toDouble()
        true
    }catch (e: Exception){
        false
    }
}

fun calcInteresPrestaEsta(valor: Double): Double{
    //usar el _ en numeros, nos sirve como referencia en los numeros, el IDE sabe que para eso lo usamos
    //y no afecta al codigo, no realmente
    if (valor>100_000.0){
        throw Exception("El prestamo no puede ser mayor que 100,000.0 pesos")

    }


    return valor*0.10
}