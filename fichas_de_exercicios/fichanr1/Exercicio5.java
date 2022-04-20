package fichas_de_exercicios.fichanr1;
/*
5. Faça um programa que inserido um número imprima o somatório dos 3 números que o
sucedem e o produto dos 3 números que o antecedem.
 */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um valor");
        int valor = ler.nextInt();
        int soma = 0, produto = 1;

        for(int i = 1; i <= 3; i++){
            soma+= (valor + i);
            produto*= (valor - i);
        }

        System.out.println("O produto dos números que antecedem o número é " + produto);
        System.out.println("A soma dos números que sucedem o número é " + soma);

    }

}
