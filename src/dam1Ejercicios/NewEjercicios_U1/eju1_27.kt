package dam1Ejercicios.NewEjercicios_U1

import kotlin.math.round

fun ejercicio27(){
    print("Escribe el nombre del producto >> ")
    val producto = readln()

    print("Escribe el precio del producto >> ")
    val precio = readln().toDouble()

    print("¿Cuántas unidades de $producto quieres?")
    val unidades = readln().toInt()

    val coste = round(precio * unidades)
    println("Producto: $producto Precio/unidad: $precio Coste total de $unidades $producto: $coste")
}