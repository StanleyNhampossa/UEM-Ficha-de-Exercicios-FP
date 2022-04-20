package fichas_de_exercicios.fichanr1;
/*
10. Faça um programa que calcule a média de 3 números. Caso a média seja par imprima os
10 primeiros números que a antecedem, caso contrário imprima os 10 primeiros números
que a sucedem.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2 = ler.nextInt();
        System.out.println("Digite o terceiro valor");
        int valor3 = ler.nextInt();
        double mediaDouble = (double) (valor1+valor2+valor3)/3;
        int media = (int) Math.round(mediaDouble);

        System.out.println("A media é " + media);
        if (media % 2 == 0) {

            for(int i = 1; i <= 10; i++) {
                System.out.print(media - i + " ");
            }

        }
        else {

            for (int i = 1; i <= 10; i++) {
                System.out.print(media + i + " ");
            }

        }

    }
}
