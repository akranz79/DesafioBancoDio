package com.br.banco.dio.banco;

import java.util.HashMap;
import java.util.Map;

import com.br.banco.dio.clientes.Cliente;

public class Banco {
    private Map<String, Cliente> clientes;

    public Banco() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCPF(), cliente);
    }

    public Cliente buscarCliente(String cpf) {
        return clientes.get(cpf);
    }
}
