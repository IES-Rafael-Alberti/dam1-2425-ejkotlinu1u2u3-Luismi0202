package dam1Ejercicios.Ejercicios_U1

fun ejercicio24(){
    val precio = pedir_precio_final()
    val precioString = "$precio"
    val precioList = precioString.split(".")
    val Euros = precioList[0]
    val Centimos = precioList[1]
    println("Euros: $Euros Céntimos: $Centimos")
}