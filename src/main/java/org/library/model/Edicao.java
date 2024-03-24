package org.library.model;

import java.sql.Date;

public class Edicao{

    private String isbn;
    private float preco;
    private Date ano;
    private int numero_paginas;
    private int id_estoque;
    private int id_editora;
    private int id_livro;

    public Edicao() {
    }

    public Edicao(String isbn, float preco, Date ano, int numero_paginas, int id_estoque, int id_editora, int id_livro) {
        this.isbn = isbn;
        this.preco = preco;
        this.ano = ano;
        this.numero_paginas = numero_paginas;
        this.id_estoque = id_estoque;
        this.id_editora = id_editora;
        this.id_livro = id_livro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getId_editora() {
        return id_editora;
    }

    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
}
