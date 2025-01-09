package dam1Ejercicios.Ejercicios_U1

fun ejercicio21(){
val frase = pedir_frase()
magia_alreves(frase)
}


fun pedir_frase():String{
    print("Dime tu nombre >> ")
    val frase = readln()
    return frase
}

fun magia_alreves(frase:String){
        println(frase.reversed())
}