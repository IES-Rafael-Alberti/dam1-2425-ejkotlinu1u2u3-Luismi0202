package dam1Ejercicios.Ejercicios_U2.Iterativas

fun introducePalabra(): String {
    return readLine() ?: ""
}

fun ejercicio13Iterativas() {
    println("¡Bienvenido a mi cueva! Todo lo que digas será convertido en eco. \nSI QUIERES SALIR DEL PROGRAMA TENDRÁS QUE ESCRIBIR (salir)")
    var noSalir = true
    while (noSalir) {
        val palabra = introducePalabra()
        if (palabra.lowercase() == "salir") {
            println("¡Hasta pronto! Vuelve cuando quieras")
            noSalir = false
        } else {
            println(palabra.uppercase())
            println(palabra.uppercase())
            println(palabra.lowercase())
            println(palabra.lowercase())
            println(palabra.lowercase())
            //He alternado entre mayúsculas y minúsculas para generar una sensación de eco.
        }
    }
}
