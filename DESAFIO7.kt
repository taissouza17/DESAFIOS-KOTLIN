fun main() {

    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()

    print("Digite a razão da PA: ")
    val razao = readln().toInt()

    var termoAtual = primeiroTermo
    var soma = 0

    println("Os 10 primeiros termos da PA são:")
    for (i in 1..10) {
        println(termoAtual)  // Exibe o termo atual da PA
        soma += termoAtual   // Soma o termo atual à soma total
        termoAtual += razao  // Calcula o próximo termo da PA
    }

    println("A soma dos 10 primeiros termos da PA é: $soma")
}
