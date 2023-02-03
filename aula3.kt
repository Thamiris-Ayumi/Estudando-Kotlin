// Laços de repetição
    for (i in 1..10){
        println(i)
    }


    // Criando uma estrutura para criação de clientes
    for (i in 1..5){
        var titular: String = "Cliente $i"
        var numeroConta: Int = 1000 + i
        var saldo = 0.0

        // Executando:
        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    // Criando um contador negativo
    for (i in 5 downTo 1){
        println(i)
    }

    // Criando um contador para "pular" números
    for (i in 5 downTo 1 step 2 ){
        println(i)
    }