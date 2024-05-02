package com.br.banco.dio.contas;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public boolean transferir(Conta destino, double valor) {
        if (valor <= getSaldo()) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}