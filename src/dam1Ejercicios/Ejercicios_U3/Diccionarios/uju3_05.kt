package dam1Ejercicios.Ejercicios_U3.Diccionarios

fun mostrarCreditosYTotales(creditos: Map<String, Int>) {
    var total = 0
    for ((asignatura, credito) in creditos) {
        println("En $asignatura tienes $credito créditos")
        total += credito
    }
    println("\nTienes un total de $total créditos")
}

fun ejercicio5Diccionario() {

    val creditos = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    mostrarCreditosYTotales(creditos)
}
