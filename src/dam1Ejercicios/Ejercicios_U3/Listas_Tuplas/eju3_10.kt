package dam1Ejercicios.Ejercicios_U3.Listas_Tuplas

fun ordenarPrecios(precios: MutableList<Int>) {
    precios.sortDescending()
}

fun ejercicio10Listas() {
    val precios = mutableListOf(50, 75, 46, 22, 80, 65, 8)
    ordenarPrecios(precios)
    println("Los precios son $precios")
    println("El precio más alto es ${precios[0]}")
    println("El precio más bajo es ${precios.last()}")
}
