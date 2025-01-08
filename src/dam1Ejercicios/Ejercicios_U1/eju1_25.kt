package dam1Ejercicios.Ejercicios_U1

fun ejercicio25(){
    val fecha = pedirFecha()
    mostrarDiaMesAno(fecha)
}


fun mostrarDiaMesAno(fecha:List<String>){
    println("Dia: ${fecha[0]} Mes: ${fecha[1]} Ano: ${fecha[2]}")
}


fun pedirFecha():List<String>{
    var opcionValida = false
    var fecha:String? = null
    while(!opcionValida){
        try{
            print("Dame una fecha en formato dd/mm/aaaa >> ")
            fecha = readlnOrNull()
            if(fecha!!.length == 10 && fecha.count{it == '/'} == 2){
                opcionValida = true
            }
            else{
                throw Exception("Fecha inválida")
            }
        }catch(e:Exception){
            println("*Error* $e vuelva a introducir")
            opcionValida = false
        }
    }
    return fecha!!.split("/")
}