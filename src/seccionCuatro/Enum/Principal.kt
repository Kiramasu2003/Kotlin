package seccionCuatro.Enum

fun main(){

    val listaTareas= arrayListOf(Tareas("Estudiar", EstadoTarea.PENDIENTE), Tareas("Lavar", EstadoTarea.REALIZADA))

    var tareasPendientes = 0

    listaTareas.forEach{
        if (it.estado==EstadoTarea.PENDIENTE)tareasPendientes++

    }

    println(listaTareas[0].estado)



}

class Tareas(var nombre: String, var estado: EstadoTarea){

}

enum class EstadoTarea {

    PENDIENTE {
        override fun toString(): String {
            return "La tarea no se ha realizado"
        }
    },
    EN_PROCESO{
        override fun toString(): String {
            return "La tarea esta en proceso"
        }
    },
    REALIZADA{
        override fun toString(): String {
            return "La tarea ha sido terminada"
        }
    }

}

