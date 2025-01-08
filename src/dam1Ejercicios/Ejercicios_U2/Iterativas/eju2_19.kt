package dam1Ejercicios.Ejercicios_U2.Iterativas

fun introduceOpcion(): Int? {
    val num = readLine()
    return try {
        val n = num?.toInt()
        if (n in 1..3){
            return n
        }
        else{
            throw IllegalArgumentException("Introduce uno de los números marcados en el menú")
        }
    } catch (e: Exception) {
        println("**ERROR** ${e.message}")
        null
    }
}

fun imprimirTexto1(): String {
    return "Seleccionaste opción 1"
}

fun imprimirTexto2(): String {
    return "Seleccionaste opción 2"
}

fun ejercicio19Iterativas() {
    var fin = false
    while (!fin) {
        println("SELECCIONA: \n1.- Comenzar programa \n 2.- Imprimir listado \n 3.- Finalizar programa")
        val seleccion = introduceOpcion()
        if (seleccion != null) {
            when (seleccion) {
                1 -> println(imprimirTexto1())
                2 -> println(imprimirTexto2())
                3 -> fin = true
            }
        }
    }
}
