fun main() {

    println("Digite o primeiro termo: ")
    var termo1 = readln().toInt()

    println("Digite o segundo termo: ")
    var termo2 = readln().toInt()

    println("Os 10 primeiros termos da Sequência de Fibonacci são:")

    for (i in 1..10) {
        val proximoTermo = termo1 + termo2
        print("$proximoTermo ")

        termo1 = termo2
        termo2 = proximoTermo
    }
}