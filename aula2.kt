// ESTUDANDO KOTLIN
// fun = indica que criamos uma function
// main = indica que o código terá seu início na execução aqui

fun main(){
    println("Hello, Bytebanker!")

    // Ao criar uma var devemos definir se ela pode ou não mudar o seu valor
    // var = pode ser modificado
    // val = não pode ser modificado
    var titular = "Thamiris"
    var numeroConta = 1000
    var saldo = 0.0

    // Executando:
    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")

    testaCondicoes(saldo)

    fun testaCondicoes(saldo: Double){
        if (saldo > 0.0) {
            println("Conta é positiva")
        } else if (saldo == 0.0){
            println("Conta neutra")
        } else (saldo < 0.0){
            println("Conta negativa")
        }
    }
}