fun main(args: Array<String>){
    //val nome = "Alex" || val idade = 22;
    val nome: String = "Alex E. S. Santiago";
    val idade: Int = 22;

    println("Olá $nome, Muito bem-vindo! \n" +
            "*Suas informações* \n" +
            "Idade: $idade anos");

    //Printando a função max(corpo de bloco) com parâmetros e colocando valores.
    max(a = 4, b= 5);

    //Printando a função soma sem parâmetro.
    println(soma());

    //Printando a função min(corpo de expressão).
    println(min(a = 8, b = 5));

    //Printando a função testeSomar com parâmetros do tipo Double.
    println(testeSomar(4.5, 5.8));
}

//Corpo de bloco
fun max(a: Int, b: Int): Any {
    return if(a > b){
     println("O primeiro numº digitado é o maior: $a");
    } else{
        println("O segundo numº digitado é o maior: $b");
    }
}

//Corpo de expressão
fun min(a: Int, b: Int) = if(a < b) a else b;

fun soma(): Int {
    val num1 = 5;
    val num2 = 10;
    val resultado = num1 + num2;

    return resultado;
}

fun testeSomar(a: Double, b: Double): Double{
    val resultado = a + b;
    return resultado;
}


