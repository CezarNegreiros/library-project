package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LivroDAO {

    public void addLivro(Livro livro){
        String sql = "insert into LIVRO " + "(id_livro, nome, lingua, ano) "
                + "values(?, ?, ?, ?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setInt(1, livro.getId_livro());
            stmt.setString(2, livro.getNome());
            stmt.setString(3, livro.getLingua());
            stmt.setInt(4, livro.getAno().getYear());

            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println(e);
            //throw new RuntimeException();
        }
    }
}
