// Implementação de métodos

// A prática de orientação a objetos é que qualquer comportamento que ajuste o estado da classe (modifique os atributos), 
deve ser implementado pela própria classe.

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0 // Por ser private, precisamos retornar este valor com o método get

    fun deposita(conta: Conta, valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if (saldo >= valor){
            saldo -= valor
        }
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double){
        saldo = valor
    }
}


// --------------------------------------------------------------------------------------------------------------------
// Note que precisamos alterar na função main a parte sobre o "saldo"

// Antes
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
}

// Depois
fun main(){
    println("Hello, Bytebanker!")
    val conta = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.saldo = 0.0

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo)

    println("Hello, Bytebanker!")
    val conta = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.saldo = 0.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo)
}

// Portanto, agora não é possível alterar o saldo quando estiver fora da class e torna ele mais seguro
