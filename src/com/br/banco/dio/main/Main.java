package com.br.banco.dio.main;

import com.br.banco.dio.banco.Banco;
import com.br.banco.dio.clientes.Cliente;
import com.br.banco.dio.contas.ContaCorrente;
import com.br.banco.dio.contas.ContaPoupanca;

//Classe Main
public class Main {
 public static void main(String[] args) {
     Banco banco = new Banco();

     // Criando contas para clientes
     ContaCorrente conta1 = new ContaCorrente("123", 1000);
     ContaPoupanca conta2 = new ContaPoupanca("456", 0.05);

     // Criando clientes
     Cliente cliente1 = new Cliente("João", "111.111.111-11", conta1);
     Cliente cliente2 = new Cliente("Maria", "222.222.222-22", conta2);

     // Adicionando clientes ao banco
     banco.adicionarCliente(cliente1);
     banco.adicionarCliente(cliente2);

     // Realizando operações bancárias
     cliente1.getConta().depositar(500);
     cliente2.getConta().depositar(1000);
     cliente1.getConta().transferir(cliente2.getConta(), 300);

     // Exibindo informações
     System.out.println("Saldo do cliente " + cliente1.getNome() + ": R$" + cliente1.getConta().getSaldo());
     System.out.println("Saldo do cliente " + cliente2.getNome() + ": R$" + cliente2.getConta().getSaldo());
 }
}
