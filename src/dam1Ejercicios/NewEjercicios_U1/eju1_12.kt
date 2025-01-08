package dam1Ejercicios.NewEjercicios_U1
import kotlin.math.pow
import kotlin.math.round

fun ejercicio12() {
    val peso = pedir_datos("¿Cuánto pesas? >> ")
    val altura = pedir_datos("¿Cuánto mides? >> ")
    val IMC = calculo_IMC(peso, altura)

    println("Peso: $peso")
    println("Altura: $altura")
    println("IMC: $IMC")
}

fun calculo_IMC(peso: Double, altura: Double): Double {
    // SIN MATH.POW --> return peso / (altura * altura)
    return round(peso / altura.pow(2.0))
}

fun pedir_datos(msj: String): Double {
    var opcion_valida = false
    var dato = 0.0

    while (!opcion_valida) {
        try {
            print(msj)
            dato = readln().toDouble()
            if (dato <= 0) {
                println("El número introducido tiene que ser positivo y mayor a 0.")
            } else {
                opcion_valida = true
            }
        } catch (e: Exception) {
            println("Número inválido, vuelva a introducir.")
        }
    }
    return round(dato)
}
