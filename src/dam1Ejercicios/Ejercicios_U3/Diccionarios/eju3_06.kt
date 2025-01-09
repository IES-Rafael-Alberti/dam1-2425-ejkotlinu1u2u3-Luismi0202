package dam1Ejercicios.Ejercicios_U3.Diccionarios

fun pedirInfo(msj: String): String {
    print(msj)
    return readLine() ?: ""
}

fun anadirInfo(info: MutableMap<String, String>, valor: String) {

    info[valor] = pedirInfo("Dame tu $valor >> ")
    println(info)
}

fun ejercicio6Diccionario() {
    val info = mutableMapOf<String, String>()
    anadirInfo(info, "Nombre")
    anadirInfo(info, "Edad")
    anadirInfo(info, "Sexo")
    anadirInfo(info, "Teléfono")
    anadirInfo(info, "Correo Electronico")
}
