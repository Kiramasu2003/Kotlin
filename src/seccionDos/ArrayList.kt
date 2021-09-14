package seccionDos

//cuál crees que sea la diferencia para declarar un array y un arraylist
// Exacto, el arrayOf(...), y el arrayListOf<TipoDato>(...)
// el <TipoDato> es opcional, el IDE lo detecta automaticamente
//la diferencia sigue siende la misma de siempre
//el array tiene un tamaño definido, y el arraylist es tamaño dinamico
fun main(){

    var esferasDragon = arrayListOf(1,2,3,4,5,6,7)
    
    println(esferasDragon.size)
    esferasDragon.add(8)
    println(esferasDragon.size)

}
