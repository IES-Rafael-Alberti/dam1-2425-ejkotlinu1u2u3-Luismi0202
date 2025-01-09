package dam1Ejercicios.Ejercicios_U1

const val VOCALES = "aeiou"


fun pedirVocal(VOCALES: String): Char? {
    var vocalValida: Char? = null
    var entradaCorrecta = false

    while (!entradaCorrecta) {
        print("Dame una vocal >> ")
        val entrada = readlnOrNull() ?: ""
        if (entrada.length == 1 && entrada[0] in VOCALES) {
            vocalValida = entrada[0]
            entradaCorrecta = true
        } else {
            println("Entrada inválida. Intenta de nuevo.")
        }
    }

    return vocalValida
}

fun volverMayuscula(frase: String, vocal: Char?) {
    if (vocal != null) {
        println(frase.replace(vocal, vocal.uppercaseChar()))
    } else {
        println("No se ingresó una vocal válida.")
    }
}

fun ejercicio22(){
    val frase = pedir_frase()
    val vocal = pedirVocal(VOCALES)
    volverMayuscula(frase,vocal)
}