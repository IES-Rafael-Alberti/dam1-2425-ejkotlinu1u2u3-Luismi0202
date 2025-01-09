package dam1Ejercicios.Ejercicios_U2.Iterativas

fun pedirNum(): Any {
    val fin = false
    while (!fin) {
        val num = readLine()!!.trim()
        try {
            val n = num.toInt()
            if (n == -1) {
                return "Salida"
            } else if (n < 0) {
                throw NumberFormatException("Introduce números positivos a no ser que quieras salir del programa con -1")
            } else {
                return n
            }
        } catch (e: NumberFormatException) {
            println("**ERROR** ${e.message}, introduce número válido.")
        }
    }
    return -1
}

fun sumaDigitos(num: Int): String {
    var sumatoria = ""
    var resultado = 0
    for (digito in num.toString()) {
        sumatoria += "$digito+"
        resultado += digito.toString().toInt()
    }
    sumatoria = sumatoria.dropLast(1)
    return "$sumatoria = $resultado"
}

fun esNumPar(num: Int): Boolean {
    return num % 2 == 0
}

fun ejercicio18Iterativas() {
    println("Ingresa números enteros positivos y te diré la suma de sus dígitos \nESCRIBE -1 PARA SALIR")
    var num = pedirNum()
    var pares = "NÚMEROS PARES INTRODUCIDOS=> "
    while (num != "Salida") {
        println(sumaDigitos(num as Int))
        if (esNumPar(num)) {
            pares += "$num,"
        }
        num = pedirNum()
    }
    println(pares.dropLast(1)) //El droplast lo que hace será borrar el último elemento para así quitarnos la coma final de encima.
}
