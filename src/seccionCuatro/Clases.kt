package seccionCuatro.img.Clases

import Clases.Auto
import seccionCuatro.Nota
import java.util.*


fun main(){

    val tmp: String = ""
    //así se crean objetos
    val nota1: Nota = Nota("Prueba", "Contenido Prueba", Date())

    /*
    nota1.nombre="Prueba"
    nota1.contenido="Contenido de prueba"

    println("Nombre: ${nota1.nombre}" +
            "Contenido: ${nota1.contenido}" +
            "Fecha de Creación: ${nota1.fechaCreacion}")
    */
    val nota2: Nota = Nota("Pruebas", "Contenido", Date())
    /*nota2.nombre="Pruebas"
    nota2.contenido="Contenida"
    */
    val listaNotas = arrayListOf<Nota>()
    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("""
            ${it.nombre}
            ${it.contenido}
            ${it.fechaCreacion}
        """.trimIndent())
    }
    //uso de constructor sec
    val note1 = Nota("Nota 1", "Contenido")
    println(nota1.nombre)
    //uso de constructor primario
    val note2 = Nota("Nota 2", "Contenido", Date())
    println(nota2.nombre)

    val auto = Auto("Chevy")
    println(auto.marca)




}

