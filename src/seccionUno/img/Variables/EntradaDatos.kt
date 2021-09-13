package seccionUno.img

fun main(){
    //usamos readline para leer datos
    println("Ingresa la cantidad de días que llevas sin bañarte")
    val dias = readLine()

    println("Ingresa el nombre de tu crush")
    val nombre = readLine()
    println("Tu crush " +nombre +" no te quiere porque llevas " + dias + " sin bañarte")
    println("F")
    val f= "Tu crush " +nombre +" no te quiere porque llevas " + dias + " sin bañarte \n F"
    println(f)
    println("Tu crush $nombre no te quiere porque llevas $dias sin bañarte \n F")
    println("""
        ***Datos***
        Ella no te quiere: $nombre
        Porque llevas apestando: $dias 
        """.trimIndent())

}