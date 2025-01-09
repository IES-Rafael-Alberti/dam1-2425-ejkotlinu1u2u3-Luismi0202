package dam1Ejercicios.Ejercicios_U3.Conjuntos

fun clienteFactura(compras: List<Triple<String, Int, Pair<Double, String>>>): Set<String> {
    val domicilios = mutableSetOf<String>()
    for (compra in compras) {
        domicilios.add(compra.third.second)
    }
    return domicilios
}

fun ejercicio1Conjuntos() {
    val compras = listOf(
        Triple("Nuria Costa", 5, Pair(12780.78, "Calle Las Flores 355")),
        Triple("Jorge Russo", 7, Pair(699.0, "Mirasol 218")),
        Triple("Nuria Costa", 7, Pair(532.90, "Calle Las Flores 355")),
        Triple("Julián Rodriguez", 12, Pair(5715.99, "La Mancha 761")),
        Triple("Jorge Russo", 15, Pair(958.0, "Mirasol 218"))
    )
    println(clienteFactura(compras))
}
