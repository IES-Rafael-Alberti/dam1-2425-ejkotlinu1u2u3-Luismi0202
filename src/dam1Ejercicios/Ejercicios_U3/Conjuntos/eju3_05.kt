package dam1Ejercicios.Ejercicios_U3.Conjuntos

fun conjuntoPar(numeros: Set<Int>): Set<Int> {
    val conjuntoPar = mutableSetOf<Int>()
    for (i in numeros) {
        if (i % 2 == 0) {
            conjuntoPar.add(i)
        }
    }
    return conjuntoPar
}

fun multiplosDeTres(numeros: Set<Int>): Set<Int> {
    val multiplos3 = mutableSetOf<Int>()
    for (i in numeros) {
        if (i % 3 == 0) {
            multiplos3.add(i)
        }
    }
    return multiplos3
}

fun interseccion(pares: Set<Int>, multiplos3: Set<Int>): Set<Int> {
    return pares intersect multiplos3
}

fun ejercicio5Conjuntos() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = conjuntoPar(numeros)
    val multiplos3 = multiplosDeTres(numeros)
    val paresYMultiplos = interseccion(pares, multiplos3)

    println("Los pares en $numeros son: $pares")
    println("Los múltiplos de 3 son: $multiplos3")
    println("Los comunes entre múltiplos de 3 y pares son: $paresYMultiplos")
}
