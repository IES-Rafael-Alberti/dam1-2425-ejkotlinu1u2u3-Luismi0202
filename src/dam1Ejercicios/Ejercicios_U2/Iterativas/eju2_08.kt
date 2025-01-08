package dam1Ejercicios.Ejercicios_U2.Iterativas


fun trianguloImpar(num: Int) {
    for (i in 1..num) {
        if (i % 2 == 1) {
            var triangulo = ""
            for (x in i downTo 1 step 2) {
                triangulo += " $x "
            }
            println(triangulo)
        }
    }
}

fun ejercicio8Iterativas() {
    println("Dame un numero entero")
    var num = introduceNum()
    while (comprobarSiNum(num)==false) {
        println("**ERROR** DEBES INTRODUCIR UN NUMERO VALIDO")
        num = introduceNum()
    }
    trianguloImpar(num.toInt())
}
