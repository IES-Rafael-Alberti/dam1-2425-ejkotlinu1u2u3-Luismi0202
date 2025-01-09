package dam1Ejercicios.Ejercicios_U1

fun ejercicio20(){
val tlf = pedir_telefono()

if(tlf!=null){
    mostrar_telefono(tlf)
}
else{
    println("*Error* Número de teléfono no válido.")
}


}

fun pedir_telefono():String?{
    val opcion_valida = false
    while(!opcion_valida){
        print("Dame un número de teléfono en formato +xx-xxxxxxxxx-xx >> ")
        val numero = readln()
        if (numero.length == 16 && numero.count{it == '-'} == 2  && numero.startsWith("+")) {
            return numero
        }
    }
    return null
}

fun mostrar_telefono(tlf: String){
    var numero = tlf.split("-")
    val prefijo = numero[0]
    val telefono = numero[1]
    val sufijo = numero[2]
    println("Prefijo: $prefijo Teléfono: $telefono Sufijo: $sufijo")
}