package seccionCuatro.Clases

class Administrado(
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String?,//le puse el ? porque es null
    salario: Double,
    var bono: Double,
    fechaNacTxt: String
) : Empleado(nombre, apellidos, direccion, telefono, salario, fechaNacTxt) {

    fun obtenerSalarioFinals(): Double{
        return salario +((salario/100)*bono)
    }

    override fun toString(): String {
        return super.toString()+"\n Salario: ${obtenerSalarioFinals()} \n Bono: $bono"
    }

}