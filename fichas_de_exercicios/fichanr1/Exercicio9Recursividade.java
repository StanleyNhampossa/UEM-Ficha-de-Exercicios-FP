package fichas_de_exercicios.fichanr1;
/*
9. Faça um programa que inserido um número calcule o seu factorial!
 */

import java.util.Scanner;

public class Exercicio9Recursividade {

    public static int calcularFactorial(int valor){
        if (valor == 0) {
            return 1;
        }
        else {
            return valor * calcularFactorial(valor - 1);
        }

    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza o valor");
        int valor = ler.nextInt();

        if (valor >= 0){
            System.out.println("O factorial de " + valor + " é " + calcularFactorial(valor));
        }
        else {
            System.out.println("Não existe o factorial de um número negativo");
        }
    }
}
