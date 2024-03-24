package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Estoque;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EstoqueDAO {


    public void addEstoque(Estoque estoque){
        String sql = "insert into ESTOQUE " + "(id_estoque, qntd_estoque) "
                + "values(?, ?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            //stmt.setInt(1, autor.getId_autor());
            stmt.setInt(1, estoque.getId_estoque());
            stmt.setInt(2, estoque.getQntd_estoque());

            stmt.execute();
        }catch(Exception e){
            System.out.println("O erro é em Estoque DAO");
            System.out.println(e);
            //throw new RuntimeException();
        }
    }
}
