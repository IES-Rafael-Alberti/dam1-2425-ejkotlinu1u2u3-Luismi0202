package dam1Ejercicios.Ejercicios_U1
import kotlin.math.round

fun ejercicio15(){
val dinero = pedir_dinero()
dinero_en_cuenta_anual(dinero)


}

fun pedir_dinero():Double{
    print("Introduce cuánto dinero tienes ahorrado")
    var opcion_valida = false
    var dinero = 0.0
    while(!opcion_valida){
    try{
        dinero = readln().toDouble()
        if (dinero <=0){
            print("El dinero ahorrado no puede ser 0 o negativo")
        }
        else{
            opcion_valida = true
        }
    }
    catch(e:Exception){
        print("*Error* Número inválido")
    }
    }
    return dinero
}

fun dinero_en_cuenta_anual(dinero:Double){
    var cuenta = dinero
    for (i in 1..4 step 1) { // Incremento de 2
        cuenta = cuenta * 1.4
        val pastagansa = round(cuenta)
        println("Al final del año $i tendrás $pastagansa en la cuenta")
    }
}