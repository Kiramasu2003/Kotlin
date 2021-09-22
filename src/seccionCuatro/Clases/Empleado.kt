package seccionCuatro.Clases

//Es importante poner open
open class Empleado (
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String?,//le puse el ? porque es null
    var salario: Double,
    fechaNacTxt: String) : Persona(nombre,apellidos, direccion, telefono, fechaNacTxt)
{
    override fun toString(): String {
        return super.toString()+ "\n Salario: $salario"
    }

    }
