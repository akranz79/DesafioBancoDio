package com.br.banco.dio.interfaces;

public interface IConta {
    String getNumero();
    double getSaldo();
    void depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(IConta destino, double valor);
}
