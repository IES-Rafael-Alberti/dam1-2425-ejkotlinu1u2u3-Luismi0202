package dam1Ejercicios.Ejercicios_U2

fun mostrarMenu() {
    println(
        """
        Ejercicios Unidad 2
        1->Condicionales
        2->Iterativas
        3->Excepciones
        """.trimIndent()
    )
}

fun seleccionar(max:Int):Int{
    var valida = false
    var opcion = 0
    while(!valida){
    try{
        println("Introduce una opción entre 1 y $max")
        opcion = readln().toInt()
        if(opcion < 0 || opcion > max){
            valida = false
        }
        else{
            valida = true
        }
    }
    catch(e:Exception){
    println("*Error* $e")
    }
        }
    return opcion
}



fun main() {
    mostrarMenu()
    val apartado = seleccionar(3)
    when(apartado){
        1-> dam1Ejercicios.Ejercicios_U2.Condicionales.main()
    }
}