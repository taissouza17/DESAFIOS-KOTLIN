import kotlin.random.Random

fun main (){

    val sorteado = Random.nextInt(1,6)

    println("ADIVINHE ENTRE 1 E 5! Palpite = ")
    val palpite = readln().toInt()

    if (palpite == sorteado) {
        println("Parabéns você acertou, $sorteado foi o numero sorteado'     ")
    }
    else {
        println("Que pena, $sorteado foi o numero sorteado")
    }

}
