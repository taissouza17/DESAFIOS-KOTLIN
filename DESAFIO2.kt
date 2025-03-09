
fun main () {
    println("digite o comprimento da 1° reta ")
    val reta1 = readln().toInt()
    println("Digite o comprimento da 2° reta ")
    val reta2 = readln().toInt()
    println("Digite o comprimento da 3° reta ")
    val reta3 = readln().toInt()


    if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2) {
        println("É possível formar um triângulo!")
    } else {
        println("Não é possível formar um triângulo.")
    }
}