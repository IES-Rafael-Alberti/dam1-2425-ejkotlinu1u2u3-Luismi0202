package dam1Ejercicios.NewEjercicios_U1

fun ejercicio26(){
    val articulos = pedirArticulos()
    mostrarArticulos(articulos)
}



fun pedirArticulos():String{
    print("Dame artículos separados por comas >> ")
    val articulos = readln()
    return articulos
}

fun mostrarArticulos(articulos:String){
    val listaArticulos = articulos.split(",")
    for(articulo in listaArticulos){
        println(articulo)
    }
}