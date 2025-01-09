package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas

fun preguntarNota(asignatura: String): Int {
    val salir = false
    var nota: Int
    while (!salir) {
        println("¿Cuánto has sacado en $asignatura?")
        val input = readLine()
        try {
            nota = input?.toInt() ?: throw NumberFormatException("La entrada no es un número.")
            if (nota in 0..10) {
                return nota
            } else {
                println("Tu nota tiene que estar entre 0 y 10.")
            }
        } catch (e: NumberFormatException) {
            println("*ERROR* ${e.message}. Vuelve a introducir.")
        }
    }
    return -1
}

fun ejercicio6Listas() {
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val notas = mutableListOf<Int>()

    for (asignatura in asignaturas) {
        val nota = preguntarNota(asignatura)
        notas.add(nota)
    }
    val asignaturasAEliminar = mutableListOf<String>()
    for (i in asignaturas.indices) {
        if (notas[i] >= 5) {
            asignaturasAEliminar.add(asignaturas[i])
        }
    }
    asignaturas.removeAll(asignaturasAEliminar)
    println("Tienes suspensas las siguientes asignaturas: $asignaturas")
}
