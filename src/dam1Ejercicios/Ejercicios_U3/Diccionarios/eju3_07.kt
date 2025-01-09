package dam1Ejercicios.Ejercicios_U3.Diccionarios

fun pedirArticulo(): String {
    print("Dame el nombre del articulo >> ")
    return readLine() ?: ""
}

fun pedirPrecio(articulo: String): Double {
    var precio: Double? = null
    do {
        print("Dame el precio de $articulo >> ")
        val input = readLine()?.toDoubleOrNull()
        if (input != null && input >= 0) {
            precio = input
        } else {
            println("*Error* El precio debe ser un número positivo. Vuelve a introducirlo.")
        }
    } while (precio == null)
    return precio
}

fun anadirArticulo(cesta: MutableMap<String, Double>) {
    val articulo = pedirArticulo()
    val precio = pedirPrecio(articulo)
    cesta[articulo] = precio
}

fun mostrarCesta(cesta: MutableMap<String, Double>) {
    println("\nLista de la compra\n")
    var total = 0.0
    for ((articulo, precio) in cesta) {
        println("$articulo | $precio")
        total += precio
    }
    println("\nTotal: $total")
}

fun preguntarSalir(): Boolean {
    print("PULSE ENTER PARA CONTINUAR PONGA SALIR PARA SALIR >> ")
    val respuesta = readLine()?.trim()?.lowercase()
    return respuesta == "salir"
}

fun ejercicio7Diccionario() {
    val cesta = mutableMapOf<String, Double>()
    var salir = false

    while (!salir) {
        anadirArticulo(cesta)
        salir = preguntarSalir()
    }

    mostrarCesta(cesta)
}
