package org.library.model;

public class Editora {

    private int id_editora;
    private String nome;
    private String endereco;
    private String telefone;

    public Editora() {
    }

    public Editora(int id_editora, String nome, String endereco, String telefone) {
        this.id_editora = id_editora;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId_editora() {
        return id_editora;
    }

    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}