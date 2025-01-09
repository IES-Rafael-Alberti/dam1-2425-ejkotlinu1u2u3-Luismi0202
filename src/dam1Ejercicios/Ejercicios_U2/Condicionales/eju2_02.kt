package dam1Ejercicios.Ejercicios_U2.Condicionales

fun introducirNumero(): String {
    println("Introduce un número:")
    return readLine() ?: ""
}

fun esNum(valor: String): Boolean {
    val valorLimpio = valor.trim()
    return if (valorLimpio.startsWith("-")) {
        valorLimpio.removePrefix("-").all { it.isDigit() }
    } else {
        valorLimpio.all { it.isDigit() }
    }
}

fun esNegativoODecimal(num: Int): Int {
    var numero = num
    while (numero < 1) {
        println("ERROR, INTRODUCE UN NÚMERO QUE SEA ENTERO POSITIVO")
        var valor = introducirNumero()
        while (!esNum(valor)) {
            println("DAME UN NÚMERO VÁLIDO")
            valor = introducirNumero()
        }
        numero = valor.toInt()
    }
    return numero
}

fun cadena(num: Int): String {
    val serie = mutableListOf<String>()
    for (i in 1..num) {
        if (i % 2 == 1) {
            serie.add(i.toString())
        }
    }
    return serie.joinToString(", ")
}

fun ejercicio2Condicionales() {
    println("Dame un número entero positivo")
    var valor = introducirNumero()
    while (!esNum(valor)) {
        println("DAME UN NÚMERO VÁLIDO")
        valor = introducirNumero()
    }
    val num = esNegativoODecimal(valor.toInt())
    println("AQUÍ TIENES LOS NÚMEROS IMPARES HASTA ESE NÚMERO:")
    println(cadena(num))
}
