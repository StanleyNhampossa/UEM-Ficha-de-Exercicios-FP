package fichas_de_exercicios.fichanr1;
/*
4. Faça um programa que dados 3 números imprima o maior e o menor.

 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double menorValor = 0, maiorValor = 0;
        for(int i = 0; i < 3; i++){

            System.out.println("Introduza um valor");
            double valor = ler.nextDouble();
            if(i == 0){
                menorValor = valor;
                maiorValor = valor;
            }
            if(valor > maiorValor){
                maiorValor = valor;
            }
            if(valor < menorValor){
                menorValor = valor;
            }


        }

        System.out.println("O menor valor digitado é " + menorValor);
        System.out.println("O maior valor digitado é " + maiorValor);


    }

}
