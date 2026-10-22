package com.meuprojeto.dao;

import com.meuprojeto.dominio.Cliente;
import com.meuprojeto.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements Crud<Cliente> {

    private List<Cliente> listaCliente = new ArrayList<>();


    @Override
    public void salvar(Cliente objeto) {

    }

    @Override
    public List<Cliente> listar() {
        return List.of();
    }

    @Override
    public Cliente buscar(int indice) {
        return null;
    }

    @Override
    public void atualizar(int indice, Cliente objeto) {

    }

    @Override
    public void deletar(int indice) {

    }
}
