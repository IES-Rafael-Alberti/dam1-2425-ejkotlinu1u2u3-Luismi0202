package dam1Ejercicios.Ejercicios_U2.Iterativas

fun introduceNum(): String {
    return readLine() ?: ""
}

fun comprobarSiNum(edad: String): Boolean {
    try {
        val edadInt = edad.toInt()
        if (edadInt >= 0){
            return true
        }
        else{
            return false
        }
    } catch (e: NumberFormatException) {
        return false
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

fun ejercicio2Iterativas() {
    println("Dime tu edad")
    var valor = introduceNum()
    while (comprobarSiNum(valor) == false) {
        println("**ERROR** Introduce un número entero positivo.")
        valor = introduceNum()
    }
    val edad = valor.toInt()
    val contador = anosCumplidos(edad)
    println("Estos son los años que has cumplido a lo largo de tu vida (a partir del 1): $contador")
}
