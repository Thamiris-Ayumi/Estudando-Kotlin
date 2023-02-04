// Implementação de métodos

// A prática de orientação a objetos é que qualquer comportamento que ajuste o estado da classe (modifique os atributos), 
deve ser implementado pela própria classe.

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0 

    fun deposita(conta: Conta, valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if (saldo >= valor){
            saldo -= valor
        }
    }
}