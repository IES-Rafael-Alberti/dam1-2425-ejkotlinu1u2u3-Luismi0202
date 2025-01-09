package dam1Ejercicios.Ejercicios_U2.Excepciones

fun Excepciones(){
    var salida = false
    while(salida == false){
        println("PULSE 0 PARA SALIR")
        println("Ejercicios de captura de Excepciones: 2,3 y 4")
        println("Selecciona uno de los ejercicios >> ")
        try{
            val ejercicio = readln().toInt()
            if(ejercicio < 0){
                throw Exception("Ejercicio Inválido (Menor a 0)")
            }
            else{
                when(ejercicio){
                    0-> salida = true
                    2-> ejercicio2Excepciones()
                    3-> ejercicio3Excepciones()
                    4-> ejercicio4Excepciones()
                }
            }
        }
        catch(e:Exception){
            println("*Error* $e")
        }
    }
}