package dam1Ejercicios.Ejercicios_U2.Condicionales

fun comprobarNum(valor: String): Boolean {
    try{
        valor.toInt()
        return true
    }
    catch(e:Exception){
        return false
    }
}

fun division(num1: Double, num2: Double): Double {
    return num1 / num2
}

fun divisorValido(num2: Double): Boolean {
    return num2 != 0.0
}

fun ejercicio3Condicionales() {
    println("¡Dame dos números!")
    var num1 = introducirNumero()
    var num2 = introducirNumero()

    var noEsNum = true
    while (noEsNum) {
        val valor1 = comprobarNum(num1)
        val valor2 = comprobarNum(num2)

        if (valor1 && valor2) {
            noEsNum = false
        } else {
            if (!valor1) {
                println("ERROR, EL NÚMERO 1 ($num1) NO ES VÁLIDO, INTRODUCE UN NÚMERO VÁLIDO PARA UN DIVIDENDO (X / $num2)")
                num1 = introducirNumero()
            }
            if (!valor2) {
                println("ERROR, EL NÚMERO 2 ($num2) NO ES VÁLIDO, INTRODUCE UN DIVISOR VÁLIDO ($num1 / X)")
                num2 = introducirNumero()
            }
        }
    }

    val numero1 = num1.toDouble()
    val numero2 = num2.toDouble()

    if (!divisorValido(numero2)) {
        println("ERROR, UN NÚMERO NO ES DIVISIBLE ENTRE CERO")
    } else {
        println("LA DIVISIÓN DE $numero1 ENTRE $numero2 ES IGUAL A... ${division(numero1, numero2)}")
    }
}
