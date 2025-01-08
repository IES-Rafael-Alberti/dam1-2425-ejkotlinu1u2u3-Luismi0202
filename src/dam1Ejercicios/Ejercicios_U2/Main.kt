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
    var seguir = true
    while(seguir == true){
    when(apartado){
        0-> {
            println("Saliendo de los ejercicios de la U2... ¡Espero que te hayan gustado!")
            seguir = false
        }
        1-> dam1Ejercicios.Ejercicios_U2.Condicionales.main()
        2-> dam1Ejercicios.Ejercicios_U2.Iterativas.main()
        }
    }
}