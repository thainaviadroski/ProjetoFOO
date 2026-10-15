package com.meuprojeto.dominio;

import java.time.LocalDate;

public class Cliente extends Base {

    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String genero;
    private String cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, LocalDate dataNascimento, String email, String telefone, String genero, String cpf, Endereco endereco, LocalDate dataCriacao, String criadoPor) {
        super(dataCriacao, criadoPor);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
