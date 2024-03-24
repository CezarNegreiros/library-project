package org.library;

import com.github.javafaker.Faker;
import org.library.config.IsbnNumber;
import org.library.dao.*;
import org.library.model.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

public class preencherBanco {
    public static void main(String[] args) {

        //Calendar calendar = Calendar.getInstance();
        Faker faker = new Faker();
        Random rand = new Random();
        EditoraDAO editoraDAO = new EditoraDAO();
        Editora editora = new Editora();
        AutorDAO autorDAO = new AutorDAO();
        Autor autor = new Autor();
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        Estoque estoque = new Estoque();
        EdicaoDAO edicaoDAO = new EdicaoDAO();
        Edicao edicao = new Edicao();
        LivroDAO livroDAO = new LivroDAO();
        Livro livro = new Livro();
        int idEditora = 0;
        int idLivro = 0;
        int idEstoque = 0;

        for( int i = 0; i < 100; i ++){

            if(i % 2 == 0){

                editora.setId_editora(idEditora);
                editora.setNome(faker.funnyName().name());
                editora.setEndereco(faker.address().streetAddress());
                editora.setTelefone(faker.phoneNumber().cellPhone());
                editoraDAO.addEditora(editora);
                idEditora++;
            }

            autor.setNome(faker.name().fullName());
            autor.setData_nascimento(new Date(faker.date().birthday().getTime()));
            autor.setPais_nascimento(faker.country().name());
            autor.setNota_biografica(faker.lorem().sentence(10));
            autorDAO.addAutor(autor);

            int qtdLivros = rand.nextInt(4, 6);

            for(int j = 0; j < qtdLivros; j++){

                livro.setId_livro(idLivro);
                livro.setNome(faker.book().title());
                livro.setLingua(faker.nation().language());
                livro.setAno(new Date(faker.date().birthday().getTime()));
                livroDAO.addLivro(livro);
                idLivro++;

            int qtdEdicoes = rand.nextInt(10, 12);

                for(int k = 0; k < qtdEdicoes; k++){

                    estoque.setId_estoque(idEstoque);
                    estoque.setQntd_estoque(rand.nextInt(150));
                    estoqueDAO.addEstoque(estoque);
                    idEstoque++;

                    edicao.setIsbn("ISBN " + IsbnNumber.gerarNumeroAleatorio());
                    edicao.setPreco(rand.nextFloat(200));
                    edicao.setAno(new Date(faker.date().birthday().getTime()));
                    edicao.setNumero_paginas(rand.nextInt(462));
                    edicao.setId_estoque(estoque.getId_estoque());
                    edicao.setId_editora(editora.getId_editora());
                    edicao.setId_livro(livro.getId_livro());
                    edicaoDAO.addEdicao(edicao);
                }
            }
        }
    }
}
