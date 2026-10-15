package com.meuprojeto.dominio;

import java.time.LocalDate;

public class Moveis extends Produto {

    private String composicao;
    private String materiais;
    private int qtdItens;

    public Moveis() {
    }

    public Moveis(String marca, String nome, String modelo, int quantidade, String descricacao, LocalDate dataCriacao, String criadoPor, String composicao, String materiais, int qtdItens) {
        super(marca, nome, modelo, quantidade, descricacao, dataCriacao, criadoPor);
        this.composicao = composicao;
        this.materiais = materiais;
        this.qtdItens = qtdItens;
    }


    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getMateriais() {
        return materiais;
    }

    public void setMateriais(String materiais) {
        this.materiais = materiais;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }
}
