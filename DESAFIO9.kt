fun main() {
    // Cria o vetor com 20 posições
    val vetor = IntArray(20)

    // Preenche o vetor com números aleatórios entre 0 e 99
    for (i in vetor.indices) {
        vetor[i] = (0..99).random()
    }

    // Exibe os números gerados
    println("Números gerados aleatoriamente:")
    for (numero in vetor) {
        print("$numero ")
    }

    // Ordena o vetor em ordem crescente
    vetor.sort()

    // Exibe os números ordenados
    println("\n\nNúmeros ordenados em ordem crescente:")
    for (numero in vetor) {
        print("$numero ")
    }
}

