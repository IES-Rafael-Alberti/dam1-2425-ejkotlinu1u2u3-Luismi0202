package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas


fun contarVocales(palabra: String, vocales: Array<String>): String {
    var resultado = ""
    for (vocal in vocales) {
        val count = palabra.count { it == vocal[0] }
        resultado += "La vocal $vocal aparece $count veces\n"
    }
    return resultado
}

fun ejercicio9Listas() {
    val vocales = arrayOf("a", "e", "i", "o", "u")
    val palabra = pedirPalabra("Dame una palabra >> ")
    println(contarVocales(palabra, vocales))
}
