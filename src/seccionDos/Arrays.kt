package seccionDos

/*
* val nombreArreglo = arrayOf(a, b, c)
*
*val bestoChonen = arrayOf ("Dragon Ball", "Invasor Zim", "Breaking Bad", "Bob Esponja")
*
*bestoChonen[0]= "Dragon Ball"
 */

fun main(){
    //arreglo de cualquier tipo de dato
    val cositas = arrayOf("Yisus", 50, 'c', 12.1111111)

    //arreglo de Int
    val numInt= intArrayOf(1,2,3,4,12,5,52,61,64,666,123)

    //arreglo de Char
    var charChar = charArrayOf('a', 'b', 'c', 'b')

    //arreglo de Double
    val doubles = doubleArrayOf(1.1, 1.22, 1.333)

    //arreglo de cadenas es con arrayOf(....)
    // si accedes a una posición que no existe en un arreglo, manda un error
    //una excepción

    println(cositas.size)
    println(numInt[5])

    //charChar[0]='a'es el valor original
    //se pueden reasignar, recuerda estanciarlo con var y no con val

    charChar[0]='z'
    println(charChar[0])

    //esto es para borrar y volver a crear el arreglo

    println(charChar.size)
    charChar = charArrayOf('a')
    println(charChar.size)
}