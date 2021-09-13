package seccionUno

//La tasa de cambio es 20MN=DLLS

var pesoMN = 0.0
var dLLS = 0.0
val conversionUno = 20.0
val convesionDos = (1/20.0)

fun main() {
    println("""
        Selecciona el número de la operación
        
        1.- Pesos MX a DLLS
        2.- DLLS a Peso MX
        3.- Salir
    """.trimIndent())

    val seleccion = readLine()!!.toInt()

    if (seleccion==1){

        println("Ingresa el monto de Pesos MX a cambiar a DLLS")
        pesoMN = readLine()!!.toDouble()
        dLLS=pesoMNDLLS(pesoMN)
        println("""
            Tu cambio en DLLS es: $$dLLS
        """.trimIndent())

    } else if (seleccion==2){
        println("Ingresa el monto de DLLS a cambiar a Pesos MX")
        dLLS = readLine()!!.toDouble()
        pesoMN= dLLSPesoMN(dLLS)
        println("""
            Tu cambio en Pesos MX es: $$pesoMN
        """.trimIndent())
    }else if (seleccion==3){
        println("""
            Gracias, Te quiero unu
        """.trimIndent())

    }else{
        println("Ño")
    }

}

fun pesoMNDLLS(ingreso: Double): Double{

    pesoMN=ingreso
    dLLS = pesoMN * conversionUno

    return dLLS
}

fun dLLSPesoMN(ingreso: Double): Double{

    dLLS=ingreso
    pesoMN= dLLS* convesionDos

    return pesoMN
}


