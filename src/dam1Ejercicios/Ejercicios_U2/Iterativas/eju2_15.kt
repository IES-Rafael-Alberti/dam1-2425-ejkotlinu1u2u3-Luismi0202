package dam1Ejercicios.Ejercicios_U2.Iterativas



fun comprobarNumero(valor: String): Boolean {
    try {
        valor.toDouble()
        return true
    } catch (e: NumberFormatException) {
        return false
    }
}

fun ejercicio15Iterativas() {
    println("Introduce números enteros para sumar. LOS NEGATIVOS NO SUMAN. \nSE TE SEGUIRÁ PIDIENDO NÚMEROS PARA AÑADIR A LA SUMA HASTA QUE PONGAS UN 0")

    var es0 = false
    var serie = "SUMATORIA=>"
    var contador = 0.0

    while (!es0) {
        var valor = introduceNum()
        while (!comprobarNumero(valor)) {
            println("**ERROR** INTRODUCE UN NÚMERO POSITIVO VÁLIDO")
            valor = introduceNum()
        }

        val num = valor.toDouble()
        if (num < 0) {
            serie += 0
        } else if (num == 0.0) {
            es0 = true
        } else {
            contador += num
            serie += " $num +"
        }
    }
    println("$serie=$contador")
}
