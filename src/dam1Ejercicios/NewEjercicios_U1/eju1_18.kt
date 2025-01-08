package dam1Ejercicios.NewEjercicios_U1

fun ejercicio18(){
val nombre = pedir_nombre()
mostrar_nombre(nombre)
}

fun pedir_nombre():String{
    print("Dime tu nombre >> ")
    val nombre = readln()
    return nombre
}

fun mostrar_nombre(nombre: String){
    println("Nombre: $nombre")
    println("Nombre en mayúsculas: ${nombre.uppercase()}")
    println("Nombre en minúsculas: ${nombre.lowercase()}")
    println("Nombre en formato título: ${nombre.replaceFirstChar { it.uppercase() }}")
}