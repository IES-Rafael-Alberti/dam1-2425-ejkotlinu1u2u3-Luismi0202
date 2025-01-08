package dam1Ejercicios.Ejercicios_U2.Excepciones

fun introduceNum(): Int {
    val opcionValida = false
    var num = 0
    while (opcionValida == false) {
        try {
            num = readln().toInt()
            if (num < 0) throw IllegalArgumentException("El número no puede ser negativo.")
            else{
                return num
            }
        } catch (e: Exception) {
            println("**ERROR**. Vuelve a introducir.")
        }
    }
    return num
}

fun mostrarImpares(num: Int): String {
    var impares = "IMPARES=> "
    for (i in 1..num) {
        if (i % 2 == 1) {
            impares += "$i,"
        }
    }
    impares = impares.dropLast(1) + "."
    return impares
}

fun ejercicio3Excepciones() {
    println("Dame un número entero positivo.")
    val num = introduceNum()
    println("Los números impares desde 1 hasta $num son: \n ${mostrarImpares(num)}")
}
