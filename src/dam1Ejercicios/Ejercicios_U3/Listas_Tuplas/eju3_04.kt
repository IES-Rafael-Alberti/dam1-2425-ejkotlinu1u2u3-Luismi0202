package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas

fun pedirEntrada(msj: String): Int {
    var entrada: Int
    val salir = false
    while (!salir) {
        println(msj)
        val input = readLine()
        if (input.isNullOrEmpty()) {
            return -1
        }
        try {
            entrada = input.toInt()
            return entrada
        } catch (e: NumberFormatException) {
            println("Recuerda que tienes que poner NÚMEROS de la lotería.")
        }
    }
    return -1
}

fun ejercicio3Listas() {
    val ganadores = mutableListOf<Int>()
    println("Escribe los números ganadores de la lotería. ESCRIBA ENTER VACÍO PARA SALIR")
    var salir = false
    while (!salir) {
        val entrada = pedirEntrada("INTRODUCE NÚMERO DE GANADOR: ")
        if (entrada == -1) {
            salir = true
        } else {
            ganadores.add(entrada)
        }
    }
    ganadores.sort()
    println(ganadores)
}
