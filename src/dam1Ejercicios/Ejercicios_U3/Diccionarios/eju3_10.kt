package dam1Ejercicios.Ejercicios_U3.Diccionarios

import java.util.*

fun introduceDatos(msj: String): String {
    println(msj)
    val scanner = Scanner(System.`in`)
    return scanner.nextLine()
}

fun esPreferente(): Boolean {
    println("¿Es el cliente preferente? S/N >> ")
    val valor = readLine()?.uppercase()
    return valor == "S"
}

fun anadirCliente(clientes: MutableMap<String, Map<String, Any>>) {
    val NIF = introduceDatos("Introduce NIF cliente >> ")
    val Nombre = introduceDatos("Introduce nombre cliente >> ")
    val Telefono = introduceDatos("Introduce teléfono cliente >> ")
    val Correo = introduceDatos("Introduce correo cliente >> ")
    val Preferente = esPreferente()
    val cliente = mapOf("Nombre" to Nombre, "Teléfono" to Telefono, "Correo" to Correo, "Preferente" to Preferente)
    clientes[NIF] = cliente
}

fun eliminarCliente(clientes: MutableMap<String, Map<String, Any>>) {
    var opcionValida = false
    while (!opcionValida) {
        val NIF = introduceDatos("Introduce el NIF del cliente a eliminar >> ")
        if (clientes.containsKey(NIF)) {
            clientes.remove(NIF)
            println("\n\nCliente eliminado con éxito. Pulsa ENTER para continuar...\n\n")
            opcionValida = true
        } else {
            println("*Error* El NIF no existe. Introduzca de nuevo")
        }
    }
}

fun mostrarCliente(clientes: MutableMap<String, Map<String, Any>>) {
    var opcionValida = false
    while (!opcionValida) {
        val NIF = introduceDatos("Introduce el NIF del cliente que quieres mostrar >> ")
        if (clientes.containsKey(NIF)) {
            println(clientes[NIF])
            println("\n\nCliente mostrado con éxito... Pulsa ENTER para continuar\n\n")
            opcionValida = true
        } else {
            println("*Error* El NIF no existe. Introduzca de nuevo")
        }
    }
}

fun mostrarClientes(clientes: MutableMap<String, Map<String, Any>>) {
    val listaClientes = mutableListOf<String>()
    for ((cliente, datos) in clientes) {
        listaClientes.add("NIF: $cliente, NOMBRE: ${datos["Nombre"]}")
    }
    println(listaClientes.joinToString("\n"))
    println("\n\nClientes mostrados con éxito... Pulsa ENTER para continuar\n\n")
}

fun mostrarPreferentes(clientes: MutableMap<String, Map<String, Any>>) {
    val preferentes = mutableListOf<String>()
    for ((cliente, datos) in clientes) {
        if (datos["Preferente"] == true) {
            preferentes.add("NIF: $cliente Nombre: ${datos["Nombre"]}")
        }
    }
    println(preferentes.joinToString("\n"))
    println("\n\nClientes preferentes mostrados con éxito... Pulsa ENTER para continuar.")
}

fun mostrarMenuEj10() {
    println("1.-Añadir cliente\n2.-Eliminar cliente\n3.-Mostrar cliente\n4.-Listar todos los clientes\n5.-Listar clientes preferentes\n6.-Terminar")
}

fun introduceOpcion(): Int {
    val opcionValida = false
    while (!opcionValida) {
        try {
            val opcion = readLine()?.toInt() ?: 0
            if (opcion in 1..6) {
                return opcion
            } else {
                throw Exception("Tienes que introducir una opción dentro del rango")
            }
        } catch (e: Exception) {
            println("*Error* ${e.message} Vuelve a introducir")
        }
    }
    return 0
}

fun ejercicio10Diccionario() {
    val clientes = mutableMapOf<String, Map<String, Any>>()
    var opcion = 0
    while (opcion != 6) {
        mostrarMenuEj10()
        opcion = introduceOpcion()
        when (opcion) {
            1 -> anadirCliente(clientes)
            2 -> eliminarCliente(clientes)
            3 -> mostrarCliente(clientes)
            4 -> mostrarClientes(clientes)
            5 -> mostrarPreferentes(clientes)
        }
    }
    println("¡Adiós!")
}
