package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Edicao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EdicaoDAO {

    public void addEdicao(Edicao edicao){
        String sql = "insert into EDICAO " + "(isbn, preco, ano, numero_paginas, id_estoque, id_editora, id_livro) "
                + "values(?, ?, ?, ?, ?, ?, ?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setString(1, edicao.getIsbn());
            stmt.setFloat(2, edicao.getPreco());
            stmt.setInt(3, edicao.getAno().getYear() + 1900);
            stmt.setInt(4, edicao.getNumero_paginas());
            stmt.setInt(5, edicao.getId_estoque());
            stmt.setInt(6, edicao.getId_editora());
            stmt.setInt(7, edicao.getId_livro());

            stmt.execute();
        }catch(Exception e){
            System.out.println("O erro é em EdicaoDAO");
            System.out.println(e);
        }
    }
}
