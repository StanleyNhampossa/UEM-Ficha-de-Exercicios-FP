package fichas_de_exercicios.fichanr3;

/*
 * 2. Crie um programa que dada uma string imprima o número de ocorrências da letra “a”.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza a frase");
        String phrase = read.nextLine();

        int count = 0;

        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println("A frase tem "+ count + " vezes a letra a");


    }

}
