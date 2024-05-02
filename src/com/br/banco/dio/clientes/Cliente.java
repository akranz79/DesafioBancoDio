package com.br.banco.dio.clientes;

import com.br.banco.dio.contas.Conta;

//Classe Cliente
public class Cliente {
 private String nome;
 private String cpf;
 private Conta conta; // Alteração aqui

 public Cliente(String nome, String cpf, Conta conta) { // Alteração aqui
     this.nome = nome;
     this.cpf = cpf;
     this.conta = conta;
 }

 public String getNome() {
     return nome;
 }

 public String getCPF() {
     return cpf;
 }

 public Conta getConta() { // Alteração aqui
     return conta;
 }
}
