package dam1Ejercicios.Ejercicios_U3.Diccionarios

fun pedirPalabra(traducciones: MutableMap<String, String>) {

    var formatoInvalido = true
    while (formatoInvalido) {
        print("Dame una palabra y su traducción en el formato espanol:ingles >> ")
        val palabra = readLine()?.trim()?.split(":") ?: listOf()
        formatoInvalido = comprobarFormato(palabra)
        if (!formatoInvalido) {
            traducciones[palabra[0]] = palabra[1]
        }
    }
}

fun comprobarFormato(palabra: List<String>): Boolean {

    return if (palabra.size != 2) {
        println("*Error* Introduce formato espanol:ingles")
        true
    } else {
        false
    }
}

fun seguirAnadiendo(msj: String): Boolean {

    print(msj)
    val anadir = readLine()?.trim()
    return anadir.isNullOrEmpty()
}

fun traducirFrase(traducciones: MutableMap<String, String>): String {

    print("Dame una frase a traducir >> ")
    val frase = readLine()?.trim() ?: ""
    val fraseTraducida = frase.split(" ").joinToString(" ") { palabra ->
        traducciones[palabra.lowercase()] ?: palabra
    }
    return "FRASE: $frase\nFRASE TRADUCIDA: $fraseTraducida"
}

fun mostrarTraduccion(traducciones: MutableMap<String, String>) {

    val frase = traducirFrase(traducciones)
    println(frase)
}

fun ejercicio8Diccionario() {

    var seguir = true
    val traducciones = mutableMapOf<String, String>()

    while (seguir) {
        pedirPalabra(traducciones)
        seguir = seguirAnadiendo("Pulsa ENTER vacío para seguir metiendo palabras. ")
    }

    seguir = true
    while (seguir) {
        mostrarTraduccion(traducciones)
        seguir = seguirAnadiendo("Pulsa ENTER vacío para seguir introduciendo frases. ")
    }
}
