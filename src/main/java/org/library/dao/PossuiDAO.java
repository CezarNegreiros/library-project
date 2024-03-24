package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Possui;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PossuiDAO {

    public void addPossui(Possui possui){
        String sql = "insert into POSSUI " + "(id_livro, id_autor) "
                + "values(?, ?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setInt(1, possui.getId_livro());
            stmt.setInt(2, possui.getId_autor());

            stmt.execute();
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
