package dam1Ejercicios.Ejercicios_U3.Diccionarios

fun mostrarMenu() {
    println(
        """
        Ejercicios Unidad 3, Diccionarios
        Ejercicios: 3,5,6,7,8 y 10
        Elige uno de los ejercicios...
        0 PARA SALIR...
        """.trimIndent()
    )
}

fun menuDiccionario() {
    var seguir = true

    while (seguir == true) {
        mostrarMenu()
        try {
            print("Tu elección: ")
            val ejercicio = readln().toInt()

            when (ejercicio) {
                3-> ejercicio3Diccionario()
                5-> ejercicio5Diccionario()
                6-> ejercicio6Diccionario()
                7-> ejercicio7Diccionario()
                8-> ejercicio8Diccionario()
                10-> ejercicio10Diccionario()
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
