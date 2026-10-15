package com.meuprojeto.dominio;

import java.time.LocalDate;

public abstract class Produto {
    private String marca;
    private String nome;
    private String modelo;
    private int quantidade;
    private String descricacao;

    private LocalDate dataCriacao;
    private String criadoPor;

    public Produto() {
    }

    public Produto(String marca, String nome, String modelo, int quantidade, String descricacao, LocalDate dataCriacao, String criadoPor) {
        this.marca = marca;
        this.nome = nome;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.descricacao = descricacao;
        this.dataCriacao = dataCriacao;
        this.criadoPor = criadoPor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }
}
