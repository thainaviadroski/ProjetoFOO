package com.meuprojeto.dao;

import com.meuprojeto.dominio.Produto;
import com.meuprojeto.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDao implements Crud<Produto> {

    private List<Produto> listaProdutos = new ArrayList<>();

    @Override
    public void salvar(Produto objeto) {
        listaProdutos.add(objeto);
    }

    @Override
    public List<Produto> listar() {
        return listaProdutos;
    }

    @Override
    public Produto buscar(int indice) {
        return listaProdutos.get(indice);
    }

    @Override
    public void atualizar(int indice, Produto objeto) {
        listaProdutos.set(indice, objeto);
    }

    @Override
    public void deletar(int indice) {
        listaProdutos.remove(indice);
    }
}
