package dam1Ejercicios.Ejercicios_U1

fun ejercicio6() {
    val precio = pedir_precio_final()

    val IVA = calcularIVA(precio)
    val precioSinIVA = calcularSinIVA(precio, IVA)

    println("Importe final (con IVA incluido): $precio")
    println("IVA (10%): $IVA")
    println("Importe sin IVA: $precioSinIVA")
}

fun pedir_precio_final(): Double {
    var opcion_valida = false
    var precio = 0.0

    while (!opcion_valida) {
        try {
            print("Dame el importe final de un artículo >> ")
            precio = readln().toDouble()

            if (precio > 0) {
                opcion_valida = true
            } else {
                println("Error, el número tiene que ser positivo y mayor a 0.")
            }
        } catch (e: Exception) {
            println("*Error* Número inválido, vuelva a introducir.")
        }
    }
    return precio
}

fun calcularIVA(precio: Double): Double {
    return precio * 0.10
}

fun calcularSinIVA(precio: Double, IVA: Double): Double {
    return precio - IVA
}