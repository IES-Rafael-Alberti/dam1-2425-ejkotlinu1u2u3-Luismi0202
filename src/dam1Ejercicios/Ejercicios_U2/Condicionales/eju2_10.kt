package dam1Ejercicios.Ejercicios_U2.Condicionales

fun introduceValor(): String {
    return readLine() ?: ""
}

fun ingredientes(tipo: String): String {
    return when (tipo.lowercase()) {
        "vegetariana" -> "Pimiento, tofu"
        "no vegetariana" -> "Peperoni, Jamón, Salmón"
        else -> "Error"
    }
}

fun seleccionIngredientes(tipo: String, ingrediente: String): String {
    return when (tipo.lowercase()) {
        "vegetariana" -> {
            if (ingrediente.lowercase() == "pimiento" || ingrediente.lowercase() == "tofu") ingrediente
            else "Error"
        }
        "no vegetariana" -> {
            if (ingrediente.lowercase() == "peperoni" || ingrediente.lowercase() == "jamón" || ingrediente.lowercase() == "salmón") ingrediente
            else "Error"
        }
        else -> "Error"
    }
}

fun ejercicio10Condicionales() {
    println("ESCRIBA: ¿Qué pizza quieres?")
    println("A) Vegetariana (Escriba vegetariana)")
    println("B) No vegetariana (Escriba no vegetariana)")

    var tipo = introduceValor()
    while (ingredientes(tipo) == "Error") {
        println("**ERROR** ¡¡¡¡Tienes que introducir (vegetariana) o (no vegetariana) en función del menú que quieras!!!!")
        tipo = introduceValor()
    }

    println("Elija un ingrediente entre estos: ${ingredientes(tipo)}")
    var ingrediente = introduceValor()

    while (seleccionIngredientes(tipo, ingrediente) == "Error") {
        println("**ERROR** Introduce un tipo de ingrediente válido para tu pizza $tipo")
        ingrediente = introduceValor()
    }

    println("Entonces quieres una pizza $tipo con los siguientes ingredientes: Mozarella, tomate, ${seleccionIngredientes(tipo, ingrediente)}... ¡Oído cocina!")
}
