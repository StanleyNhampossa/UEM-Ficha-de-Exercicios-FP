package fichas_de_exercicios.fichanr1;
/*
7. Faça um programa que inseridos números faça a soma dos positivos e a soma dos
negativos. O programa deve terminar e exibir o somatório dos números inseridos quando
for inserido o número 0.
 */

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor, somaPositivos = 0, somaNegativos = 0;
        do {
            System.out.println("Digite um valor");
            valor = ler.nextInt();
            if (valor > 0){
                somaPositivos+= valor;
            }
            else {
                somaNegativos+= valor;
            }


        } while (valor != 0);

        System.out.println("A soma dos valores negativos é " + somaNegativos);
        System.out.println("A soma dos valores positivos é " + somaPositivos);


    }

}
