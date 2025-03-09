fun main() {

    println("Escolha Pedra, Papel ou Tesoura: ")

    val jogador = readln().capitalize()


    if (jogador != "Pedra" && jogador != "Papel" && jogador != "Tesoura") {
        println("Opção inválida! Tente novamente.")
        return
    }

    val computador = when ((1..3).random()) {
        1 -> "Pedra"
        2 -> "Papel"
        else -> "Tesoura"
    }

    println("Você escolheu: $jogador")
    println("O computador escolheu: $computador")

    if (jogador == computador) {
        println("Empate!")
    } else if ((jogador == "Pedra" && computador == "Tesoura") ||
        (jogador == "Papel" && computador == "Pedra") ||
        (jogador == "Tesoura" && computador == "Papel")) {
        println("Você venceu!")
    } else {
        println("O computador venceu!")
    }
}
