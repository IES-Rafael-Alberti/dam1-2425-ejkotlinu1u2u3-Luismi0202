package dam1Ejercicios.Ejercicios_U3

import dam1Ejercicios.Ejercicios_U3.Conjuntos.menuConjuntos
import dam1Ejercicios.Ejercicios_U3.Diccionarios.menuDiccionario
import dam1Ejercicios.Ejercicios_U3.Listas_Tuplas.menuListas

fun mostrarMenu() {
    println("PULSA 0 PARA SALIR")
    println(
        """
        Ejercicios Unidad 3
        1->Listas y tuplas
        2->Diccionarios
        3->Conjuntos
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



fun main_U3() {
    var seguir = true
    while(seguir == true){
        mostrarMenu()
        val apartado = seleccionar(3)
        when(apartado){
            0-> {
                println("Saliendo de los ejercicios de la U3... ¡Espero que te hayan gustado!")
                seguir = false
            }
            1-> menuListas()
            2->menuDiccionario()
            3->menuConjuntos()
        }
    }
}