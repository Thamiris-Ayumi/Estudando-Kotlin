// Estrutura condicional When
    // When (semelhante ao if)
    var opcao = 3

    when(opcao) {
        1 -> print("Suco de uva")
        2 -> print("Suco de maracujá")
        3 -> print("Suco de laranja")
        4 -> print("Suco de limão")
        else -> println("Nenhuma opção foi selecionada")
    }

    // Podemos também atribuir um valor a uma variável
    var mensagem = when(opcao){
        1 -> "Suco de uva"
        2 -> "Suco de maracujá"
        3 -> "Suco de laranja"
        4 -> "Suco de limão"
        else -> "Nenhuma opção foi selecionada"
    }
        println(mensagem)