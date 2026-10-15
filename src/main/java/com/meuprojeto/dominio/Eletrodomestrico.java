package com.meuprojeto.dominio;

import java.time.LocalDate;

public class Eletrodomestrico extends Produto {

    private int voltagem;
    private int potencial;
    private String especificacoes;

    public Eletrodomestrico() {
    }

    public Eletrodomestrico(String marca, String nome, String modelo, int quantidade, String descricacao, LocalDate dataCriacao, String criadoPor, int voltagem, int potencial, String especificacoes) {
        super(marca, nome, modelo, quantidade, descricacao, dataCriacao, criadoPor);
        this.voltagem = voltagem;
        this.potencial = potencial;
        this.especificacoes = especificacoes;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencial() {
        return potencial;
    }

    public void setPotencial(int potencial) {
        this.potencial = potencial;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }
}
