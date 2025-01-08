package dam1Ejercicios.Ejercicios_U2.Iterativas

fun main(){
    var salida = false
    while(!salida){
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

                }
            }
        }
        catch(e:Exception){
            println("*Error* $e")
        }
    }
}