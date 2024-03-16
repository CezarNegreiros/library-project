package org.library.model;

import java.sql.Date;

public class Livro {

    private int id_livro;
    private String nome;
    private String lingua;
    private Date ano;
    private String isbn;

    public Livro() {
    }

    public Livro(int id_livro, String nome, String lingua, Date ano, String isbn) {
        this.id_livro = id_livro;
        this.nome = nome;
        this.lingua = lingua;
        this.ano = ano;
        this.isbn = isbn;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
