package org.library.dao;

import org.library.factory.ConnectionFactory;
import org.library.model.Editora;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EditoraDAO {

    public void addEditora(Editora editora){
        String sql = "insert into EDITORA " + "(id_editora, nome, endereco, telefone) "
                + "values(?, ?, ?, ?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setInt(1, editora.getId_editora());
            stmt.setString(2, editora.getNome());
            stmt.setString(3, editora.getEndereco());
            stmt.setString(4, editora.getTelefone());

            stmt.execute();
            stmt.close();
        }catch(Exception e){
            System.out.println("O erro é em EditoraDAO");
            System.out.println(e);
            //throw new RuntimeException();
        }
    }
}
