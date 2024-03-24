package org.library.config;
import java.util.Random;

public class IsbnNumber {
    public static String gerarNumeroAleatorio() {
        Random rand = new Random();

        // Gerar partes aleatórias da sequência
        String parte1 = generateRandomDigits(3, rand);
        String parte2 = generateRandomDigit(rand);
        String parte3 = generateRandomDigits(4, rand);
        String parte4 = generateRandomDigits(4, rand);
        String parte5 = generateRandomDigit(rand);

        // Construir a sequência completa
        String numeroAleatorio = parte1 + "-" + parte2 + "-" + parte3 + "-" + parte4 + "-" + parte5;
        return numeroAleatorio;
    }

    // Função para gerar uma quantidade específica de dígitos aleatórios
    public static String generateRandomDigits(int length, Random rand) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(rand.nextInt(10)); // Adiciona um dígito aleatório de 0 a 9
        }
        return sb.toString();
    }

    // Função para gerar um dígito aleatório
    public static String generateRandomDigit(Random rand) {
        return String.valueOf(rand.nextInt(10)); // Gera um dígito aleatório de 0 a 9
    }

}
