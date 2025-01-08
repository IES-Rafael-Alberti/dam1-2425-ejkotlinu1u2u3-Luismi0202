package dam1Ejercicios.Ejercicios_U2.Iterativas

fun magiaTriangulo(num: Int): String {
    var contador = ""
    for (i in 1..num) {
        contador += "*".repeat(i) + "\n"
    }
    return contador
}

fun ejercicio6Iterativas() {
    println("Dame un numero entero y lo transformare en un triangulo con magia...")
    var num = introduceNum()
    while (comprobarSiNum(num) == false) {
        println("**ERROR** Tienes que introducir un numero entero positivo...")
        num = introduceNum()
    }
    println(magiaTriangulo(num.toInt()))
}
