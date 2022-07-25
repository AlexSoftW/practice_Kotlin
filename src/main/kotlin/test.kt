fun main(){
    val nome: String = "Alex"
    var idade: Int = 21
    idade = 22

    println("Olá $nome!, idade: $idade")
    println("O resultado da soma é: ${soma(10,20)}")
}

fun soma(a: Int, b: Int): Int{
    return a + b
}