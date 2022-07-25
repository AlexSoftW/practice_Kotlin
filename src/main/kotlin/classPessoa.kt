class pessoa(
    val nome: String,
    val idade: Int
)

class dog(
    val nome: String,
    val raca: String,
    val porte: String,
    val pelagem: String
)

fun main(){
    val pessoa1: pessoa = pessoa("Alex", 22)
    val dog1: dog = dog("Cachoro caramelo","Vira-lata", "médio", "bege")

    println("Nome: ${pessoa1.nome}, idade:${pessoa1.idade}")
    println("Status do cachorro \n" +
            "Nome: ${dog1.nome} \n" +
            "Raça: ${dog1.raca} \n" +
            "Porte: ${dog1.porte} \n" +
            "Cor: ${dog1.pelagem}")

}