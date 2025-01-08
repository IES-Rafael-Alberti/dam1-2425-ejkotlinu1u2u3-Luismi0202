package dam1Ejercicios.Ejercicios_U1

fun ejercicio4(){
    val celsius = pedirCelsius()
    if (celsius != null) {
        println("La temperatura ingresada es: $celsius °C")
        val fahrenheit = transformarFahrenheit(celsius)
        println("La temperatura en Fahrenheit es: $fahrenheit °F")
    } else {
        println("No se ingresó una temperatura válida.")
    }
}

fun transformarFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun pedirCelsius(): Double? {
    var celsius: Double? = null
    var opcionValida = false

    while (!opcionValida) {
        print("Dame la temperatura en grados Celsius >> ")
        try {
            val input = readln().toDouble()
            if (input < 0) {
                println("Error: La temperatura no puede ser negativa.")
            } else {
                celsius = input
                opcionValida = true
            }
        } catch (e: Exception) {
            println("Error: Número no válido. Intenta de nuevo.")
        }
    }
    return celsius
}
