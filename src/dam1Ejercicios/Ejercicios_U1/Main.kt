package dam1Ejercicios.Ejercicios_U1

fun mostrarMenu() {
    println(
        """
        Ejercicios Unidad 1
        Ejercicios: 4, 6, 12, 15, 18, 20, 21, 22, 24, 25, 26, 27
        Elige uno de los ejercicios...
        0 PARA SALIR...
        """.trimIndent()
    )
}

fun main() {
    var seguir = true

    while (seguir) {
        mostrarMenu()
        try {
            print("Tu elección: ")
            val ejercicio = readln().toInt()

            when (ejercicio) {
                4 -> ejercicio4()
                6 -> ejercicio6()
                12 -> ejercicio12()
                15 -> ejercicio15()
                18 -> ejercicio18()
                20 -> ejercicio20()
                21 -> ejercicio21()
                22 -> ejercicio22()
                24 -> ejercicio24()
                25 -> ejercicio25()
                26 -> ejercicio26()
                27 -> ejercicio27()
                0 -> {
                    println("Saliendo a Main principal... ¡Espero que hayas disfrutado la U1!")
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
