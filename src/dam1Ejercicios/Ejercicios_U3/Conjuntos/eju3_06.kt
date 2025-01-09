package dam1Ejercicios.Ejercicios_U3.Conjuntos

fun crearConsonantes(): Set<Char> {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val consonantes = mutableSetOf<Char>()
    for (i in 'a'..'z') {
        if (i !in vocales) {
            consonantes.add(i)
        }
    }
    return consonantes
}

fun letrasComunes(vocales: Set<Char>, consonantes: Set<Char>): Set<Char> {
    return vocales intersect consonantes
}

fun ejercicio6Conjuntos() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val consonantes = crearConsonantes()
    val interseccion = letrasComunes(vocales, consonantes)

    println("Las consonantes son $consonantes y las letras comunes son $interseccion")
    println("Spoiler: Yo lo sabía antes que la máquina, te he ganado toma, Luismi 1 máquina 0")
}
