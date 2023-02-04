// Curso de Kotlin
// Aula 1- Vaiável mutável e imutável
// Link da aula no yotube: https://youtu.be/hEbb9cckl9c

// var = mutável durante a execução
// val = imutável durante a execução


/* Tipos de variáveis
    String = texto
    byte = números inteiros (é preciso declarar o tipo e, normalmente utilizado para salvar idade do usuário)
    int = números inteiros
    long = números inteiros
    float = números decimais
    double = números decimais
    boolean = true ou false
*/


fun main(args: Array<String>){
    println("Hello, World!")

    // Mutável
    var nome = "Thamiris"
    nome = "Thamiris Ayumi"
    println(nome);

    // Imutável
    val dataNascimento = 2004
    println(dataNascimento)
}