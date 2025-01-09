package dam1Ejercicios.Ejercicios_U3.Diccionarios


fun solicitarFruta(): String {
    print("Introduce el nombre de la fruta: ")
    return readLine()?.lowercase()?.trim() ?: ""
}

fun solicitarKilos(): Double {
    print("Introduce el número de kilos: ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}

fun calcularPrecio(precioPorKilo: Double, kilos: Double): Double {
    return precioPorKilo * kilos
}

fun mostrarPrecio(fruta: String, kilos: Double, precioTotal: Double) {
    println("El precio de $kilos kilos de $fruta es $${"%.2f".format(precioTotal)}.")
}

fun mostrarFrutaNoEncontrada(fruta: String) {
    println("Lo sentimos, no tenemos información sobre la fruta \"$fruta\".")
}

fun ejercicio3Diccionario() {
    val preciosFrutas = mapOf(
        "manzana" to 2.5,
        "pera" to 3.0,
        "naranja" to 1.8,
        "platano" to 1.2,
        "uva" to 2.0
    )

    val fruta = solicitarFruta()
    val kilos = solicitarKilos()

    if (preciosFrutas.containsKey(fruta)) {
        val precioTotal = calcularPrecio(preciosFrutas[fruta]!!, kilos)
        mostrarPrecio(fruta, kilos, precioTotal)
    } else {
        mostrarFrutaNoEncontrada(fruta)
    }
}

