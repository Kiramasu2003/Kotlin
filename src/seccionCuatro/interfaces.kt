package seccionCuatro

interface interfaces {
    //los metodos solo pueden ser public o private
    //la herencia multiple es con interfaces

    fun obtenerA(): Double
    fun obtenerP(): Double
    fun dibujar()

    fun centimetroPu(valor: Double): Double{
        return (1/2.54)*valor
    }

}

interface Grafica {
    fun dibujar()
}