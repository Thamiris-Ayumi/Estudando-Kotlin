// Orientação a Objetos


fun main(){
    println("Hello, Bytebanker!")
    val conta = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.saldo = 0.0

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Hello, Bytebanker!")
    val conta = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.saldo = 0.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    // Implementando um depósito (maneira incorreta)
    contaAlex.saldo += 50.0
    println(contaAlex.saldo)

    // Implementando um depósito (maneira correta)
    fun deposita(conta: Conta, valor: Double){
        conta.saldo += valor
    }
}


// Para nomear uma class, devemos utilizar a primeira letra maiúscula
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0 
}

// Laço de repetição
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