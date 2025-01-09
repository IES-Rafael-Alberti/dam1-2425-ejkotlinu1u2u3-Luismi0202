package dam1Ejercicios.Ejercicios_U2.Iterativas


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

fun ejercicio4Iterativas() {
    println("Dame un numero entero positivo")
    var valor = introduceNum()
    while (!comprobarSiNum(valor)) {
        println("**ERROR**, Introduce un numero entero positivo. \n Prueba de nuevo:")
        valor = introduceNum()
    }
    val num = valor.toInt()
    val contador = cuentaAtras(num)
    println("Su cuenta atras desde 0 hasta $num es: $contador")
}
