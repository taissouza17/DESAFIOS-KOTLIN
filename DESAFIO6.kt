import kotlin.random.Random

fun main() {
    // Sorteia um número entre 1 e 10
    val numeroSorteado = Random.nextInt(1, 11)

    println("Tente adivinhar o número sorteado entre 1 e 10! Você tem 4 tentativas.")

    var tentativas = 4

    while (tentativas > 0) {
        println("Você tem $tentativas tentativas restantes.")
        println("Digite seu palpite: ")
        val palpite = readln().toInt()

        if (palpite == numeroSorteado) {
            println("Parabéns!Você acertou o número!")
            return
        } else {
            tentativas--
            if (palpite < numeroSorteado) {
                println("O número sorteado é maior que o seu palpite.")
            } else {
                println("O número sorteado é menor que o seu palpite.")
            }
        }
    }

    println("Você perdeu! O número sorteado era $numeroSorteado.")
}

