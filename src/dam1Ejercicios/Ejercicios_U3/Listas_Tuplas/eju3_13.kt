package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas

import kotlin.math.sqrt

fun pedirEntrada(msj: String, max: Boolean = true): Double {
    var valor: Double
    var esValido = false
    while (!esValido) {
        println(msj)
        val input = readLine()
        try {
            valor = input?.toDouble() ?: throw NumberFormatException("La entrada no es un número.")
            if (max && valor < 0) {
                throw IllegalArgumentException("El número máximo no puede ser negativo")
            }
            esValido = true
            return valor
        } catch (e: Exception) {
            println("**Error** Número incorrecto. ${e.message}. Introduce de nuevo.")
        }
    }
    return -1.0  // Esto no se alcanzará nunca
}

fun pedirNumeros(max: Double): List<Double> {
    val numeros = mutableListOf<Double>()
    val maximosDisponibles = max.toInt()
    println("Introduce $maximosDisponibles números:")
    for (i in 1..maximosDisponibles) {
        val numero = pedirEntrada("Te quedan ${maximosDisponibles - i} números >> ", false)
        numeros.add(numero)
    }
    return numeros
}

fun mediaTotal(numeros: List<Double>): Double {
    val suma = numeros.sum()
    return suma / numeros.size
}

fun desviacionTipica(numeros: List<Double>, media: Double): Double {
    var suma = 0.0
    for (numero in numeros) {
        suma += (numero - media) * (numero - media)
    }
    return sqrt(suma / numeros.size)
}

fun mostrarResultados(media: Double, desvTipica: Double) {
    println("La media es $media")
    println("La desviación típica es $desvTipica")
}

fun ejercicio13Listas() {
    val max = pedirEntrada("¿Cuántos números quieres meter? >> ")
    val numeros = pedirNumeros(max.toDouble())
    val media = mediaTotal(numeros)
    val desvTipica = desviacionTipica(numeros, media)
    mostrarResultados(media, desvTipica)
}
