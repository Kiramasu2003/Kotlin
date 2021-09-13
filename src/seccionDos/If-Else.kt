package seccionDos

val sesionInit= true//false
val promedio = 7.4
val estatura = 1.79
val eresLatino = true
val eresWapo = false

fun main(){
    /*si solo se tiene una linea de código en el if, y en el else, se omiten los { }
    En cuyo caso de ser 2 lineas o más, obligatoriamente debes de ponerla

    if(teQuier=true){
        println("Yupiiii uwu")
        seCasan()
    }else{
        println("Noooooooooooooo unu")
        println("Ya ni modo *w*")
        teDuermes()
    }
    */
    if (sesionInit==true)
        println("Hice Waffles, están hechos de Waffles")
    else
        println("ZZZZZZZZZZZ")

    if (promedio > 7.5){
        println("Yupiiiiii, entraste a la superior")
        println("Otros años de sufrimiento y sin dormir en la noche supergarantizados")
    }else if(promedio == 7.5){
        println("Entraste apenitas owo")
        println("Echalé ganas, rey")
    }else if (promedio < 7.5){
        println("Tssssss, GG vida")
        println("Ahora trabajas en un callCenter en el que te pagan 2000 pesos Quincenales")
    }


    //el < o > deben ir antes del =, <=, >=
    if (estatura >= 1.75){
        println("""
            Eres Grande, Drake
        """.trimIndent())
    }else if (estatura <= 1.75){
        println("""
            Si mides tu estatura desde tu
            cabezita hasta el ciele, eres muy grande UvU
        """.trimIndent())

    }

    if (eresLatino==true && eresWapo==false){
        println("Dificultad de vida: Extremo")
        println("Echale ganas, disfruta del dolor")
    }else if(eresLatino==!false && eresWapo == !false){
        println("Dificultad de vida: un Poco Fácil")
    }else if (eresLatino==false || eresWapo== true){
        println("""
            Ya sé que esté ultima condición es algo rara
            Pero es para enseñarte xD
            
            Dificultad de vida= fácil
        """.trimIndent())
    }



    /*
    *
    if (sesionInit!=false){
        println("Hice Waffles, están hechos de Waffles")
    }else{
        println("ZZZZZZZZZZZ")
    }
    *
    *y ya te la sabes, if-elseif-elseif-...-else
    * */
}