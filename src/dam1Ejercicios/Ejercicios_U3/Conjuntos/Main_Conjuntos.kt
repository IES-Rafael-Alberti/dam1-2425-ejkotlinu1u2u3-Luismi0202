package dam1Ejercicios.Ejercicios_U3.Conjuntos


fun mostrarMenu() {
    println(
        """
        Ejercicios Unidad 3, Conjuntos
        Ejercicios: 1,2,3,4,5 y 6
        Elige uno de los ejercicios...
        0 PARA SALIR...
        """.trimIndent()
    )
}

fun menuConjuntos() {
    var seguir = true

    while (seguir == true) {
        mostrarMenu()
        try {
            print("Tu elección: ")
            val ejercicio = readln().toInt()

            when (ejercicio) {
                1-> ejercicio1Conjuntos()
                2-> ejercicio2Conjuntos()
                3->ejercicio3Conjuntos()
                4-> ejercicio4Conjuntos()
                5-> ejercicio5Conjuntos()
                6-> ejercicio6Conjuntos()
                0 -> {
                    println("Saliendo a Main principal... ¡Espero que hayas disfrutado de los Conjuntos!")
                    seguir = false
                }
                else -> println("Por favor, elige un número válido del menú.")
            }

            if (seguir) pausa()

        } catch (e: Exception) {
            println("Entrada inválida. Por favor, introduce un número entero.")
        }
    }
}

fun pausa() {
    print("Pulsa ENTER para continuar...")
    readln()
}