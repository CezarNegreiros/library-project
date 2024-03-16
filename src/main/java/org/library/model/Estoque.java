package org.library.model;

public class Estoque {

    private int id_estoque;
    private int qntd_estoque;

    public Estoque() {
    }

    public Estoque(int id_estoque, int qntd_estoque) {
        this.id_estoque = id_estoque;
        this.qntd_estoque = qntd_estoque;
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getQntd_estoque() {
        return qntd_estoque;
    }

    public void setQntd_estoque(int qntd_estoque) {
        this.qntd_estoque = qntd_estoque;
    }
}
