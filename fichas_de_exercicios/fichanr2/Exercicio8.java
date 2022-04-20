package fichas_de_exercicios.fichanr2;

/*
8. Escreva um programa que receba um ano e verifique se o ano é comum ou bissexto.
 */

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o ano");
        int ano = ler.nextInt();

        if (ano % 4 == 0) {

            if ((ano % 100 == 0) && (ano % 400 != 0)) {

                System.out.println("O ano não é bissexto");

            }

            else {

                System.out.println("O ano é bissexto");

            }

        }
        else {

            System.out.println("O ano não é bissexto");

        }

    }
}
