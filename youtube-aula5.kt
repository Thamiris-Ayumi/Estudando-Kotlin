// ARRAYS

import java.util.*

fun main(args: Array<String>){

// Array (utilizado para criar listas com tamanhos definidos)
                     //Indice   //0      // 1      //2       //3
    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Frango")
    println(listaCompras[2])

    // Como buscar todos os itens da lista:
    // Primeiro faça o import do "java.util.*"
    println(Arrays.toString(listaCompras))

    // Para descobrir o tamanho da lista ou quantidade de itens que ela possui:
    println(listaCompras.size)
}