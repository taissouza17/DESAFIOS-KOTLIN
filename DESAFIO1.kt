fun main (){
    println ("Quantos cigarros você fuma por dia? ")
    val cig = readln().toInt()

    println("Há quantos anos voce fuma ? ")
    val anos = readln().toInt()
    val minutosT = cig * anos * 365  * 10

    val dias = minutosT/1440
    println("Fumando $cig cigarros por dia, durante $anos anos, você perderá $dias dias de vida !")
}