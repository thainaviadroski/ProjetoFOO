package com.meuprojeto.interfaces;

import java.util.List;

public interface Crud<T> {

    void salvar(T objeto);

    List<T> listar();

    T buscar(int indice);

    void atualizar(int indice, T objeto);

    void deletar(int indice);
}
