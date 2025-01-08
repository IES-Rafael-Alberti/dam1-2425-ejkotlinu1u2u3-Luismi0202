package dam1Ejercicios.Ejercicios_U2.Excepciones

fun introduceEdad(): String {
    return readLine() ?: ""
}

fun comprobarSiNum(edad: String): Any {
    return try {
        val edadInt = edad.toInt()
        if (edadInt < 0) false else edadInt
    } catch (e: NumberFormatException) {
        false
    }
}

fun anosCumplidos(edad: Int): String {
    var contador = ""
    for (i in 1..edad) {
        if (i == edad) {
            contador += "$i."
        } else {
            contador += "$i,"
        }
    }
    return contador
}

fun ejercicio2Excepciones() {
    println("Dime tu edad")
    var valor = introduceEdad()
    while (comprobarSiNum(valor) == false) {
        println("**ERROR** Introduce un número entero positivo.")
        valor = introduceEdad()
    }
    val edad = (comprobarSiNum(valor) as Int)
    val contador = anosCumplidos(edad)
    println("Estos son los años que has cumplido a lo largo de tu vida (a partir del 1): $contador")
}
