package seccionCuatro

import kotlin.math.roundToInt

class Rectangulo(var base: Double, var altura: Double) : ClasesAbstractas() {
    override fun obtenerArea(): Double {
        return base*altura
    }

    override fun obtenerPerimetro(): Double {
        return 2*(base+altura)
    }

    override fun dibujar() {
        for (i in 1..altura.roundToInt()){
            println(" * ".repeat(base.toInt()))
        }
    }

    fun obtenerAreaPulg(): Double {
        return centimetrosPulgadas(obtenerArea())
    }

    fun obtenerPerimetroPulg(): Double {
        return centimetrosPulgadas(obtenerPerimetro())
    }



}