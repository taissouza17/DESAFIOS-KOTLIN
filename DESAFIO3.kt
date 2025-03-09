
fun main() {
    println("digite o comprimento da 1° reta ")
    val reta1 = readln().toDouble()
    println("Digite o comprimento da 2° reta ")
    val reta2 = readln().toDouble()
    println("Digite o comprimento da 3° reta ")
    val reta3 = readln().toDouble()


    if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2) {
        println("É possível formar um triângulo!")
        if (reta1 == reta2 && reta2 == reta3) {
            println("O triângulo é equilátero.")
        } else if (reta1 == reta2 || reta2 == reta3 || reta1 == reta3) {
            println("O triângulo é isósceles.")
        } else {
            println("O triângulo é escaleno.")
        }
    } else {
        println("Não é possível formar um triângulo.")
    }


}