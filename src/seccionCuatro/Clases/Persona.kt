package seccionCuatro.Clases

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofPattern

open class Persona(
    var nombre: String,
    var apellidos: String,
    var direccion: String,
    var telefono: String?,//le puse el ? porque es null
    var fechaNacTxt: String
) {

    var fechaNacDat1: LocalDate = LocalDate.parse(fechaNacTxt, DateTimeFormatter.ofPattern(FORMATO_FECHA))

    fun obtenerEdad():Int{
        return Period.between(fechaNacDat1, LocalDate.now()).years
    }

    override fun toString(): String {
        return "Nombre: $nombre $apellidos\n Dirección: $direccion\n telefono: ${telefono?: "NoData"}\n fecha de Nacimiento: $fechaNacTxt\n Edad: ${obtenerEdad()}"
    }
    companion object{
        const val FORMATO_FECHA="dd/MM/yyyy"
    }
}