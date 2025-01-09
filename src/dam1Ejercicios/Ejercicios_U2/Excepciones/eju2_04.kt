package dam1Ejercicios.Ejercicios_U2.Excepciones

fun comprobarNum(num: Int): Boolean {
    try {
        num >= 0
    } catch (e: NumberFormatException) {
        return false
    }
    return true
}

fun cuentaAtras(num: Int): String {
    var contador = ""
    for (i in num downTo 0) {
        if (i == 0) {
            contador += "$i."
        } else {
            contador += "$i,"
        }
    }
    return contador
}

fun ejercicio4Excepciones() {
    println("Dame un número entero positivo")
    var num = introduceNum()
    while (!comprobarNum(num)) {
        println("**ERROR**, Introduce un número entero positivo. \n Pruebe de nuevo:")
        num = introduceNum()
    }
    val contador = cuentaAtras(num)
    println("Su cuenta atrás desde 0 hasta $num es: $contador")
}
