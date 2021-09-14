package seccionDos

//cuál crees que sea la diferencia para declarar un array y un arraylist
// Exacto, el arrayOf(...), y el arrayListOf<TipoDato>(...)
// el <TipoDato> es opcional, el IDE lo detecta automaticamente
//la diferencia sigue siende la misma de siempre
//el array tiene un tamaño definido, y el arraylist es tamaño dinamico
fun main(){

    var esferasDragon = arrayListOf(1,2,3,4,5,6,7)

    println(esferasDragon[6])//vemos que valor hay en index:6
    println(esferasDragon.size)//el tamaño del arraylist
    esferasDragon.add(8)//añadir elementos al array, lo agrega en el ultimo indice
    println(esferasDragon[7])//vemos que si lo agrego correctamente
    println(esferasDragon.size)//el nuevo tamaño
    esferasDragon.removeAt(7)//removemos el elemento en index:7
   //vemos el nuevo tamaño despues de remover el elemento index:7
    println(esferasDragon.size)
    esferasDragon[6]=8//reemplazamos el 7, por el 8


    var abcedario= arrayListOf<Char>('z', 'h', 'q', 'b','a')
    var numeros = arrayListOf<Int>(30,12,24,15,1232,0)
    abcedario.sort()//reordenamos el array, se ordenara alfabeticamente, o
    numeros.sort()

    var counter = 0
    for(letra in abcedario){
        println("""
            la letra $letra está en la posición $counter
        """.trimIndent())
        counter++

    }

    var counter2 = 0
    for(numero in numeros){
        println("""
            el numero $numero está en la posición $counter2
        """.trimIndent())
        counter2++

    }
    //función lambda
    abcedario.forEach{ letra ->
        println("""
            letra es $letra
        """.trimIndent())
    }

    abcedario.forEachIndexed { i, letra ->

        println("""
            letra $letra está en la posición $i
        """.trimIndent())
    }




}
