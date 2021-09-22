package seccionCuatro

import seccionCuatro.Clases.Administrado
import seccionCuatro.Clases.Empleado
import seccionCuatro.Clases.Persona

fun main(){

    val persona = Persona("Jesus", "Moreno", "Desc", "5576454903", "12/05/2012")
    val empleado = Empleado("Alberto", "Moreno", "Conocido", null, 2012.0, "12/05/1963")
    val administrado = Administrado("Juan", "Gomez", "Desc", "5566778899", 55555.1, 12.0, "14/01/1980" )

    println(persona.toString())
    println(empleado.toString())
    println(administrado.toString())
    println(administrado.toString())


    val rectangulo= Rectangulo(30.0, 10.5)

    println(rectangulo.obtenerArea())
    println(rectangulo.obtenerPerimetro())
    println(rectangulo.obtenerAreaPulg())
    println(rectangulo.obtenerPerimetroPulg())
    println(rectangulo.dibujar())

    val rectangulo1 = Rect1(30.0, 10.5)
    println(rectangulo1.obtenerA())
    println(rectangulo1.obtenerP())
    println(rectangulo1.obtenerAreaPulg())
    println(rectangulo1.obtenerPerimetroPulg())
    println(rectangulo1.dibujar())

    val personaA = PersonaA("JuanCarlos", "5577777777")
    val personaB = PersonaB("RobertoGian", "1234567")

    println(personaA.toString())
    println(personaB.toString())


}

class PersonaA(var nombre: String, var telefono: String)

data class PersonaB(var nombre: String, var telefono: String)