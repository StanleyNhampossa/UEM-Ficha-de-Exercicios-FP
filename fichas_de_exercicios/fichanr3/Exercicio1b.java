package fichas_de_exercicios.fichanr3;

/*
 * 1. Crie dois programas de validação de gênero que funcionem da seguinte maneira:
 * b) É válido caso a primeira letra seja “m” e a nona “o” ou caso a primeira seja “f” e a oitava “o”.
 */

import java.util.Scanner;

public class Exercicio1b {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a frase");
        String phrase = read.nextLine();

        try {

            if (((phrase.toLowerCase().startsWith("m")) && (phrase.toLowerCase().charAt(8) == 'o')) || ((phrase.toLowerCase().startsWith("f")) && (phrase.toLowerCase().charAt(7) == 'o'))) {
                System.out.println("Válido");
            } else {
                System.out.println("Iválido");
            }

        }catch (Exception e){

            System.out.println("Inválido");

        }

    }

}
