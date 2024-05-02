package com.br.banco.dio.contas;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean transferir(Conta destino, double valor) {
        if (valor <= getSaldo() + limite) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}