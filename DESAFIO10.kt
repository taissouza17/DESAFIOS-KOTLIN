fun main() {

    println("Digite o primeio termo: ")
    var termo1 = readln().toInt()

    println("Digite o primeio termo: ")
    var termo2 = readln().toInt()

    println("Digite o número de termos da sequência Fibonacci:")
    val n = readln().toInt()

    print("$termo1 >> $termo2 >> ")

    for (i in 3..n) {
        val proximoTermo = termo1 + termo2
        print("$proximoTermo >> ")

        termo1 = termo2
        termo2 = proximoTermo
    }

    println("FIM")
}