package fichas_de_exercicios.fichanr1;
/*
9. Faça um programa que inserido um número calcule o seu factorial!
 */

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza o valor");
        int valor = ler.nextInt();

        if(valor < 0){
            System.out.println("Não existe factorial de um número negativo");
        }
        else {
            int factorial = 1;
            for (int i = 1; i <= valor; i++) {
                factorial *= i;
            }
            System.out.println("O factorial de " + valor + " é " + factorial);
        }


    }

}
