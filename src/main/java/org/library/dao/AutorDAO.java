package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Autor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class AutorDAO {


    public void addAutor(Autor autor){
        String sql = "insert into AUTOR " + "(id_autor, nome, data_nascimento, pais_nascimento, nota_biografica) "
                + "values(?, ?, ?, ?, ?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setInt(1, autor.getId_autor());
            stmt.setString(2, autor.getNome());
            stmt.setDate(3, autor.getData_nascimento());
            stmt.setString(4, autor.getPais_nascimento());
            stmt.setString(5, autor.getNota_biografica());

            stmt.execute();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
