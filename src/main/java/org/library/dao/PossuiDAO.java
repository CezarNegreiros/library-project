package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Possui;

import java.sql.PreparedStatement;

public class PossuiDAO {

    ConnectionFactory connection = new ConnectionFactory();
    public void addPossui(Possui possui){
        String sql = "insert into POSSUI " + "(id_livro, id_autor) "
                + "values(?, ?)";

        try {
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            stmt.setInt(1, possui.getId_livro());
            stmt.setInt(2, possui.getId_autor());

            stmt.execute();
            stmt.close();
        }catch(Exception e){
            throw new RuntimeException();
        }
    }
}
