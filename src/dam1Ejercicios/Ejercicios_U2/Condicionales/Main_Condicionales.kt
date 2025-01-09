package dam1Ejercicios.Ejercicios_U2.Condicionales

fun Condicionales(){
    var salida = false
    while(salida==false){
        println("PULSE 0 PARA SALIR")
        println("Ejercicios Condicionales: 2,3,6,8 y 10")
        println("Selecciona uno de los ejercicios >> ")
        try{
            val ejercicio = readln().toInt()
            if(ejercicio < 0){
                throw Exception("Ejercicio Inválido (Menor a 0)")
            }
            else{
                when(ejercicio){
                    0-> salida = true
                    2-> ejercicio2Condicionales()
                    3-> ejercicio3Condicionales()
                    6-> ejercicio6Condicionales()
                    8-> ejercicio8Condicionales()
                    10-> ejercicio10Condicionales()
                }
            }
        }
        catch(e:Exception){
            println("*Error* $e")
        }
    }
}