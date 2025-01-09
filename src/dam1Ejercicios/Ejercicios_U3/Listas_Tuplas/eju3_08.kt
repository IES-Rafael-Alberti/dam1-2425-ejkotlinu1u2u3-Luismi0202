package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas

fun pedirPalabra(msj: String): String {
    println(msj)
    return readLine()?.trim()?.lowercase() ?: ""
}

fun esPalindromo(palabra: String): Boolean {
    val listaPalabra = palabra.toList()
    return listaPalabra == listaPalabra.reversed() //Esto lo he hecho ya que devolverá directamente si es palíndromo o no
}

fun mostrarResultado(esPalindromo: Boolean) {
    if (esPalindromo) {
        println("Su palabra es un palíndromo")
    } else {
        println("Su palabra NO es un palíndromo")
    }
}

fun ejercicio8Listas() {
    val palabra = pedirPalabra("Dame una palabra >> ")
    val esPalindromo = esPalindromo(palabra)
    mostrarResultado(esPalindromo)
}
