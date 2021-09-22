package seccionCuatro

import java.util.*

//Constructor Primario
//por default es public
class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date) {
    //Bloque de inicialización del constructor primario
    init {
        println()
        nombre=nombre.toUpperCase()
        numerosintancias++
    }
    //Constructor Secundario
    constructor(nombre: String, contenido: String): this(nombre, contenido, Date()){
        println("Se instancio el constructor secundario")
    }

    fun imprimir(){
        println("nombre: $nombre" +
                "contenido: $contenido" +
                "fecha: $fechaCreacion")
    }

    fun contarPalabrasCont(): Int{
        val palabras = contenido.split(" ")
        println("Metodo 1")
        return palabras.size
    }

    fun contarPalabrasCont(palabra: String): Int{
        val palabras = contenido.split(" ")
        println("Metodo 2")
        var contador=0

        palabras.forEach{
            if (it.uppercase()==palabra.uppercase())contador++
        }
        return palabras.size
    }


    //un companion object
    companion object{
        var numerosintancias=0
    }
}