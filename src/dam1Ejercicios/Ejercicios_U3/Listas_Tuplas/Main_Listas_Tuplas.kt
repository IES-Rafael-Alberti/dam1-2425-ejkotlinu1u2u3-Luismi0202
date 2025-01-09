package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas

fun mostrarMenu() {
    println(
        """
        Ejercicios Unidad 3, Listas y Tuplas
        Ejercicios: 4,6,8,9,10 y 13
        Elige uno de los ejercicios...
        0 PARA SALIR...
        """.trimIndent()
    )
}

fun menuListas() {
    var seguir = true

    while (seguir == true) {
        mostrarMenu()
        try {
            print("Tu elección: ")
            val ejercicio = readln().toInt()

            when (ejercicio) {
                4-> ejercicio3Listas()
                6-> ejercicio6Listas()
                8-> ejercicio8Listas()
                9-> ejercicio9Listas()
                10-> ejercicio10Listas()
                13-> ejercicio13Listas()
                0 -> {
                    println("Saliendo a Main principal... ¡Espero que hayas disfrutado de las Listas!")
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
