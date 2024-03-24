package org.library.model;

import java.sql.Date;
import java.util.Calendar;

public class Autor {

    private int id_autor;
    private String nome;
    private Date data_nascimento;
    private String pais_nascimento;
    private String nota_biografica;

    public Autor(){

    }
    public Autor(String nome, Date data_nascimento, String pais_nascimento, String nota_biografica) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.pais_nascimento = pais_nascimento;
        this.nota_biografica = nota_biografica;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getPais_nascimento() {
        return pais_nascimento;
    }

    public void setPais_nascimento(String pais_nascimento) {
        this.pais_nascimento = pais_nascimento;
    }

    public String getNota_biografica() {
        return nota_biografica;
    }

    public void setNota_biografica(String nota_biografica) {
        this.nota_biografica = nota_biografica;
    }
}
