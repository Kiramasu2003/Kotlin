package seccionCuatro

import kotlin.math.roundToInt

class Rect1(var base: Double, var altura: Double) : interfaces, Grafica {
    override fun obtenerA(): Double {
        return base*altura
    }

    override fun obtenerP(): Double {
        return 2*(base+altura)
    }

    override fun dibujar() {
        for (i in 1..altura.roundToInt()){
            println(" * ".repeat(base.toInt()))
        }
    }

    fun obtenerAreaPulg(): Double {
        return centimetroPu(obtenerA())
    }

    fun obtenerPerimetroPulg(): Double {
        return centimetroPu(obtenerP())
    }
}