package dam1Ejercicios.Ejercicios_U3.Conjuntos

fun conjuntoPotencia(s: Set<Int>): List<Set<Int>> {
    val resultado = mutableListOf<Set<Int>>(emptySet())
    for (i in s) {
        val nuevosSubconjuntos = mutableListOf<Set<Int>>()
        for (j in resultado) {
            nuevosSubconjuntos.add(j + i)
        }
        resultado.addAll(nuevosSubconjuntos)
    }
    return resultado
}

fun ejercicio3Conjuntos() {
    val listaPotencia = conjuntoPotencia(setOf(6, 1, 4))
    println(listaPotencia)
}
