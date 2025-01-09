package dam1Ejercicios.Ejercicios_U2.Condicionales

val SEXOS = listOf("hombre", "mujer")

fun introduceNombre(): String {
    println("Dame tu nombre:")
    return readLine()?.trim() ?: ""
}

fun introduceSexo(): String {
    println("Dime tu sexo:")
    return readLine()?.trim() ?: ""
}

fun comprobarSiNum(valor: String): Boolean {
    val valorLimpio = valor.trim()
    return if (valorLimpio.startsWith("-")) {
        valorLimpio.removePrefix("-").all { it.isDigit() }
    } else {
        valorLimpio.all { it.isDigit() }
    }
}

fun grupo(sexo: String, nombre: String): String {
    val nombreInicial = nombre.firstOrNull()?.uppercaseChar() ?: return "Nombre inválido"
    return if (sexo.lowercase() == "hombre") {
        if (nombreInicial > 'N') "Usted está en el grupo A" else "Usted está en el grupo B"
    } else if (sexo.lowercase() == "mujer") {
        if (nombreInicial < 'M') "Usted está en el grupo A" else "Usted está en el grupo B"
    } else {
        "Sexo inválido"
    }
}

fun ejercicio6Condicionales() {
    var nombre = introduceNombre()
    var sexo = introduceSexo()

    while (comprobarSiNum(nombre) || comprobarSiNum(sexo)) {
        if (comprobarSiNum(nombre)) {
            println("**ERROR** Los números no son válidos. INTRODUCE DE NUEVO SU NOMBRE:")
            nombre = introduceNombre()
        }
        if (comprobarSiNum(sexo)) {
            println("**ERROR** Los números no son válidos. INTRODUCE DE NUEVO SU SEXO:")
            sexo = introduceSexo()
        }
    }

    while (sexo.lowercase() !in SEXOS) {
        println("**ERROR** INTRODUCE SU SEXO (HOMBRE O MUJER):")
        sexo = introduceSexo()
    }

    println(grupo(sexo, nombre))
}
