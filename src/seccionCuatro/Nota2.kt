package seccionCuatro

class Nota2(var nombre: String, var contenido: String, var fechaCreacion: String) {

    init {
        numeroInstancias++
    }

    //propiedad de la class
    companion object{

        var numeroInstancias = 0

    }
}