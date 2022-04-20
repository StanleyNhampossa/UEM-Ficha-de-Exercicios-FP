package fichas_de_exercicios.fichanr3;

/*
 * 1. Crie dois programas de validação de gênero que funcionem da seguinte maneira:
 * a) É válido se e somente se a primeira letra for “m” ou “f” e a última “o”, (independentemente da
 * dimensão da letra), valida a primeira e última
 */

import java.util.Scanner;

public class Exercicio1a {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a palavra");
        String phrase = read.nextLine();

        if((phrase.toLowerCase().startsWith("f") || phrase.toLowerCase().startsWith("m")) && phrase.toLowerCase().endsWith("o")){
            System.out.println("Válido");
        }
        else
            System.out.println("Inválido");


    }





}
