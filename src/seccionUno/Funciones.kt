package seccionUno

import java.util.*
/*                                      firma
*  modificadorDeAcceso palabraReservada nombre(parametros): tipoDatoRetorno{
*
*   codigo xDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
* }
*
*  public fun ejemplo(){
*   ...
* }
*  private fun ejemplo(){
*   ...
* }
*
*  protected fun ejemplo(){
*   ...
* }
*
* fun ejemplo(){
* ...
* }
*
* */

val global = "Ella no te quiere"

fun main(){

    mostrarMensaje()
    mostrarDatos("Arturo", 92)
    calcularImpuestos(1000.10, 69.0)
    calcularImpuestosDos(1000.02, 1231231241324.1)
    println(global)
    //println(local) Manda Error UnU
    ejemplo()

}

fun mostrarMensaje(){

    println("""
        Mensaje: Adios Cerdo, ya me voy
        fecha: ${Date()}
        
    """.trimIndent())


}

fun mostrarDatos(nombre: String, edad: Int) {
    println(
        """
        Nombre del dictaminado:$nombre
        Edad a la que saldra de Batiz: $edad
    """.trimIndent()
    )
}

fun calcularImpuestos(salario: Double, porcentajeImpuesto: Double): Double{

    //val totalImpuestos=(salario/100)*porcentajeImpuesto
    //return totalImpuestos
    println("""
        Eso es lo que le debes a Hacienda por extorsionar Gatos
    """.trimIndent())
    return (salario/100)*porcentajeImpuesto
}

fun calcularImpuestosDos(salario: Double, porcentajeImpuesto: Double = 10.0): Double{

    //val totalImpuestos=(salario/100)*porcentajeImpuesto
    //return totalImpuestos
    println("""
        Eso es lo que le debes a Hacienda por extorsionar Gatos
    """.trimIndent())
    return (salario/100)*porcentajeImpuesto
}

fun ejemplo(){
    val local = "Ella si te quiere, te ama, y se quiere casar contigo"
    println(local)

}