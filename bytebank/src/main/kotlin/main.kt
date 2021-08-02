fun main() {

    print("Bem vindo ao ByteBank")

    //variáveis no kotlin
    //var (variavel multável) e val (variavel imultavel)

    //inferir tipo na variável no kotlin mesmo não inferindo o tipo ele entende pelo tipo
    // de dado que está sendo atribuido.

    var i = 0
    while(i < 5 ) {

        val titular: String = "Lucivaldo $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++

    }

    /* FOR

    for (i in 5 downTo 1 step 1) {


            if(i == 4){
            //podemos utilizar continue ou break dependendo da situação que quiser.
            break
            }


        val titular: String = "Lucivaldo $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        // testa saldo neutro -> saldo = 0.0

        // testa saldo negativo -> saldo -= 1000

        //concatenação podemos usar (+ ou utilizar utilizar o string template $)
        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        }
     */

        //Utilizando Estruturas Condicionais

//    testacondicoes(saldo)
    }

fun testacondicoes(saldo: Double) {

//IF

    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }


// Quando

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

