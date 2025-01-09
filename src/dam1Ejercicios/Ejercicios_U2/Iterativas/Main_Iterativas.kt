package dam1Ejercicios.Ejercicios_U2.Iterativas

fun Iterativas(){
    var salida = false
    while(salida == false){
        println("PULSE 0 PARA SALIR")
        println("Ejercicios Iterativas: 2,4,6,7,8,13,15,18,19 y 25")
        println("Selecciona uno de los ejercicios >> ")
        try{
            val ejercicio = readln().toInt()
            if(ejercicio < 0){
                throw Exception("Ejercicio Inválido (Menor a 0)")
            }
            else{
                when(ejercicio){
                    0-> salida = true
                    2-> ejercicio2Iterativas()
                    4-> ejercicio4Iterativas()
                    6-> ejercicio6Iterativas()
                    7-> ejercicio7Iterativas()
                    8-> ejercicio8Iterativas()
                    13-> ejercicio13Iterativas()
                    15-> ejercicio15Iterativas()
                    18-> ejercicio18Iterativas()
                    19-> ejercicio19Iterativas()
                    25-> ejercicio25Iterativas()
                }
            }
        }
        catch(e:Exception){
            println("*Error* $e")
        }
    }
}