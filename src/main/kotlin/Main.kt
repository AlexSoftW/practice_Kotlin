fun main(args: Array<String>){
    //val nome = "Alex" || val idade = 22;
    val nome: String = "Alex E. S. Santiago";
    val idade: Int = 22;

    println("Olá $nome, Muito bem-vindo! \n" +
            "*Suas informações* \n" +
            "Idade: $idade anos");

    //Printando a função max com parâmetros e colocando valores.
    println(max(a = 4, b = 2));

    //Printando a função soma sem parâmetro.
    println(soma());
}

fun max(a: Int, b: Int): Any {
    return if(a > b){
     println("O primeiro numº digitado é o maior: $a");
    } else{
        println("O segundo numº digitado é o maior: $b");
    }
}

fun soma(): Int {
    val num1 = 5;
    val num2 = 10;
    val resultado = num1 + num2;

    return resultado;
}