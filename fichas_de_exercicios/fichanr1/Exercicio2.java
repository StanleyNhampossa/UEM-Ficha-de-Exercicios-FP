package fichas_de_exercicios.fichanr1;
/*
2. Faça um programa que dados dois números imprima a sua soma, diferença, seu produto
e quociente.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o primeiro valor");
        int valor1 = ler.nextInt();
        System.out.println("Introduza o segundo valor");
        int valor2 = ler.nextInt();

        System.out.println("A soma dos valores é " + (valor1 + valor2));
        System.out.println("A diferença dos valores é " + (valor1 - valor2));
        System.out.println("O produto dos valores é " + (valor1 * valor2));

        if (valor2 == 0){
            System.out.println("Não é possível fazer o quociente pois o valor do divisor é 0");
        }
        else {
            System.out.println("O quociente dos valores é " + ((float)(valor1/valor2)));
        }

    }
}
