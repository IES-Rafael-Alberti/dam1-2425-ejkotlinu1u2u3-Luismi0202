package dam1Ejercicios.Ejercicios_U2.Iterativas

fun introduceFrase(): String {
    return readLine() ?: ""
}

fun palabraMayor(palabras: List<String>): String {
    var palabraLarga = ""
    for (palabra in palabras) {
        if (palabra.length > palabraLarga.length) {
            palabraLarga = palabra
        }
    }
    return palabraLarga
}


fun ejercicio25Iterativas() {
    println("Escribe una frase y te diré cuál es la palabra más larga de la frase.")
    val frase = introduceFrase()
    val palabras = frase.split(" ")
    val palabraLarga = palabraMayor(palabras)
    val numPalabras = palabras.size
    println("La palabra más larga de la frase es $palabraLarga y hay $numPalabras palabras en la frase.")
}
