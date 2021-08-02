fun main () {

    print("Bem vindo ao ByteBank")

    //variáveis no kotlin
    //var (variavel multável) e val (variavel imultavel)

    //inferir tipo na variável no kotlin mesmo não inferindo o tipo ele entende pelo tipo
    // de dado que está sendo atribuido.

    val titular: String = "Lucivaldo"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    //concatenação podemos usar (+ ou utilizar utilizar o string template $)
    println("titular $titular")
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")
}