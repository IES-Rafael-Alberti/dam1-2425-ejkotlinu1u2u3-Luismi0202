package dam1Ejercicios.Ejercicios_U3.Conjuntos

fun pedirAlumnos(msj: String): String {
    print(msj)
    return readLine()!!.trim()
}

fun noEsSalida(alumno: String): Boolean {
    return alumno.lowercase() != "x"
}

fun anadirAlumnos(msj: String): Set<String> {
    val alumnos = mutableSetOf<String>()
    var noSalida = true
    while (noSalida) {
        val alumno = pedirAlumnos(msj)
        noSalida = noEsSalida(alumno)
        if (noSalida) {
            alumnos.add(alumno)
        }
    }
    return alumnos
}

fun mostrarAlumnos(alumnos1: Set<String>, alumnos2: Set<String>) {
    println("Nombres de alumnos sin repeticiones:\nPRIMARIA: $alumnos1\nSECUNDARIA: $alumnos2")
}

fun mostrarIguales(alumnos1: Set<String>, alumnos2: Set<String>) {
    println("Los nombres de alumnos en común entre ambos son: ${alumnos1.intersect(alumnos2)}")
}

fun mostrarNoIgualesPrimaria(alumnos1: Set<String>, alumnos2: Set<String>) {
    println("Los nombres de primaria que no se repiten en secundaria son ${alumnos1 - alumnos2}")
}

fun mostrarSiTodosCoinciden(alumnos1: Set<String>, alumnos2: Set<String>) {
    val iguales = if (alumnos1 == alumnos2) "SON TODOS IGUALES" else "NO SON TODOS IGUALES"
    println("Entre primaria y secundaria los nombres... $iguales")
}

fun ejercicio2Conjuntos() {
    val alumnosPrim = anadirAlumnos("Dame el nombre de un alumno de primaria >> ")
    val alumnosSec = anadirAlumnos("Dame el nombre de un alumno de secundaria >> ")

    mostrarAlumnos(alumnosPrim, alumnosSec)
    mostrarIguales(alumnosPrim, alumnosSec)
    mostrarNoIgualesPrimaria(alumnosPrim, alumnosSec)
    mostrarSiTodosCoinciden(alumnosPrim, alumnosSec)
}
