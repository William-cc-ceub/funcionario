package com.mgs.funcionario.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String alergia;
    private String problemaMedicos;
    private String contatoEmergencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getProblemaMedicos() {
        return problemaMedicos;
    }

    public void setProblemaMedicos(String problemaMedicos) {
        this.problemaMedicos = problemaMedicos;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }
}