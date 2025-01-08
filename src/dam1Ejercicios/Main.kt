package dam1Ejercicios

fun mostrarMenu() {
    println("SELECCIONA UNA DE LAS OPCIONES")
    println("1-> Ejercicios de la Unidad 1")
    println("2-> Ejercicios de la Unidad 2")
    println("3-> Ejercicios de la Unidad 3")
    println("PULSE 0 PARA SALIR")
    println(">>")
}

fun main() {
    var seguir = true
    while (seguir) {
        mostrarMenu()
        val opcion = try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            println("Por favor, ingresa un número válido.")
        }

        when (opcion) {
            0 -> {
                println("Saliendo...")
                seguir = false
            }
            1 -> dam1Ejercicios.Ejercicios_U1.main()
            2 -> dam1Ejercicios.Ejercicios_U2.main()
            else -> println("Opción no válida. Por favor, selecciona una opción entre 0 y 3.")
        }
    }
}
