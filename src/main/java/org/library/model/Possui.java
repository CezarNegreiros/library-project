package org.library.model;

public class Possui {
    private int id_livro;
    private int id_autor;

    public Possui() {
    }

    public Possui(int id_livro, int id_autor) {
        this.id_livro = id_livro;
        this.id_autor = id_autor;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }
}
