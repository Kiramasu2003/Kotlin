package seccionCuatro

abstract class ClasesAbstractas {

    abstract fun obtenerArea(): Double
    abstract fun obtenerPerimetro(): Double
    abstract fun dibujar()

    protected fun centimetrosPulgadas(valor: Double): Double{
        return (1/2.54)*valor
    }
}