package org.library;

import com.github.javafaker.Faker;
import org.library.dao.AutorDAO;
import org.library.model.Autor;

import java.sql.Date;
import java.util.Calendar;

public class preencherBanco {
    public static void main(String[] args) {

        //Calendar calendar = Calendar.getInstance();
        Faker faker = new Faker();
        String nome;
        Date dataNascimento = new Date(faker.date().birthday().getTime());
        String paisNascimento;
        String notaBiografica;

        AutorDAO autorDAO = new AutorDAO();
        Autor autor = new Autor();
            //calendar.setTime(faker.date().birthday());
            nome = faker.name().fullName();
            dataNascimento = dataNascimento;
            paisNascimento = faker.country().name();
            notaBiografica = faker.lorem().sentence(6);


            System.out.println(dataNascimento);
            System.out.println(paisNascimento);
            System.out.println(notaBiografica);
            System.out.println(nome);

            autor.setNome(nome);
            autor.setData_nascimento(dataNascimento);
            autor.setPais_nascimento(paisNascimento);
            autor.setNota_biografica(nome);

            autorDAO.addAutor(autor);


    }
}
