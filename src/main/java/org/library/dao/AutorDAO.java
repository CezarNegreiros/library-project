package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Autor;

import java.sql.Date;
import java.sql.PreparedStatement;

public class AutorDAO {

    ConnectionFactory connection = new ConnectionFactory();
    public void addAutor(Autor autor){
        String sql = "insert into AUTOR " + "(nome, data_nascimento, pais_nascimento, nota_biografica) "
                + "values(?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            //stmt.setInt(1, autor.getId_autor());
            stmt.setString(1, autor.getNome());
            stmt.setDate(2, autor.getData_nascimento());
            stmt.setString(3, autor.getPais_nascimento());
            stmt.setString(4, autor.getNota_biografica());

            stmt.execute();
            stmt.close();
        }catch(Exception e){
            throw new RuntimeException();
        }
    }
}
