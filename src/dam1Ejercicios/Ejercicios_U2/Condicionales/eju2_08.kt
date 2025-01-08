package dam1Ejercicios.Ejercicios_U2.Condicionales

fun introducePuntuacion(): String {
    return readLine() ?: ""
}


fun nivel(num: Double): Any {
    return when {
        num == 0.0 || num < 0.4 -> 0.0
        num == 0.4 || num < 0.6 -> 0.4
        num >= 0.6 -> num
        else -> "Error"
    }
}

fun dinero(num: Double): String {
    val cantidadDinero = 2400 * num
    return "USTED CONSIGUE $cantidadDinero€ CADA MES"
}

fun ejercicio8Condicionales() {
    println("Dame tu puntuación")
    var valor = introducePuntuacion()
    var esNum = false
    var esNivel = false

    while (!esNum) {
        if (comprobarSiNum(valor)) {
            esNum = true
        } else {
            println("**ERROR** TIENES QUE INTRODUCIR UN NÚMERO")
            valor = introducePuntuacion()
        }
    }

    var num = valor.toDouble()

    while (!esNivel) {
        if (nivel(num) == "Error") {
            println("El número introducido es menor que 0, vuelve a introducir")
            valor = introducePuntuacion()
            while (!comprobarSiNum(valor)) {
                println("**ERROR** TIENES QUE INTRODUCIR UN NÚMERO")
                valor = introducePuntuacion()
            }
            num = valor.toDouble()
        } else {
            esNivel = true
        }
    }

    val puntNivel = nivel(num) as Double
    println(dinero(puntNivel))
}
