package dam1Ejercicios.Ejercicios_U3.Conjuntos

fun setFrutas(frutas: List<String>): Set<String> {
    return frutas.toSet()
}

fun frutasIguales(set1: Set<String>, set2: Set<String>): Set<String> {
    return set1.intersect(set2)
}

fun frutasDistintas(set1: Set<String>, set2: Set<String>): Set<String> {
    return set1.subtract(set2)
}

fun mostrarResultados(comunes: Set<String>, frutas1: Set<String>, frutas2: Set<String>) {
    println("Los elementos comunes entre ambas listas son: $comunes")
    println("Las frutas que están solo en frutas1 son: $frutas1")
    println("Las frutas que están solo en frutas2 son: $frutas2")
}

fun ejercicio4Conjuntos() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val setFrutas1 = setFrutas(frutas1)
    val setFrutas2 = setFrutas(frutas2)

    val frutasComunes = frutasIguales(setFrutas1, setFrutas2)
    val soloFrutas1 = frutasDistintas(setFrutas1, setFrutas2)
    val soloFrutas2 = frutasDistintas(setFrutas2, setFrutas1)

    mostrarResultados(frutasComunes, soloFrutas1, soloFrutas2)
}
