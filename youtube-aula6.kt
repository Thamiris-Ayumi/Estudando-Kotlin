 // Estruturas de repetição 
    // While (enquanto)

    // Criando uma estrutura de repetição com contador:
    var indice = 0

    while (indice <= 4){
        println(listaCompras[indice])
        indice++
    }

    // Ou também podemos utilizar:
    while (indice <= listaCompras.size-1){
        println(listaCompras[indice])
        indice++
    }

// -------------------------------------------------------------------------------------------

    // For

    // Criando uma estrutura de repetição com contador:
    for (indice in 0 .. 9){
        println(listaCompras[indice])
    }

    // Ou também podemos utilizar:
    for (indice in 0 .. listaCompras.size-1){
        println(listaCompras[indice])
    }
