package dam1Ejercicios.Ejercicios_U2.Iterativas

fun tabla(num: Int): String {
    var tabla = "Tabla del $num\n"
    for (i in 1..10) {
        tabla += "$num * $i = ${num * i}\n"
    }
    return tabla
}

fun ejercicio7Iterativas() {
    for (i in 1..10) {
        println(tabla(i) + "\n")
    }
}
