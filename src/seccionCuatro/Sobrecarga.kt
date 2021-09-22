package seccionCuatro

import java.util.*

//metodo es muy similar a una función
//A un método se le pasa implícitamente el objeto en el qeu se llamó
//Un método puede operar sobre datos contenidos dentro de la clase
fun main(){
    val mensaje= "Hola mundo"
    //este es un metodo
    println(mensaje.toUpperCase())

    val nota1 = Nota("Nota 1", "Activa el protocolo caída del murcielago", Date())

    nota1.imprimir()
    println(nota1.contarPalabrasCont())
    println(nota1.contarPalabrasCont("Soy Batman"))
}
