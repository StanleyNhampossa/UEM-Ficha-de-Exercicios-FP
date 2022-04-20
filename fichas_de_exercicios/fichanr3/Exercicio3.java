package fichas_de_exercicios.fichanr3;

/*
3. Crie um programa que dada uma sequência de dígitos, isto é, um número, conte e separe cada dígito
e imprima os dígitos pares e os dígitos ímpares.
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        try {

            System.out.println("Introduza um número");
            String numberStr = read.nextLine();
            //int a = 1234;
            int [] array = new int[numberStr.length()];

            for(int i = 0; i < array.length; i++){

                array[i] = Integer.parseInt(numberStr.substring(i, i + 1));

            }

            System.out.println("Números pares");
            for(int a : array){

                if(a % 2 == 0){
                    System.out.print(a + " ");
                }

            }

            System.out.println();

            System.out.println("Números ímpares");
            for(int a : array){

                if(a % 2 == 1){
                    System.out.print(a + " ");
                }

            }






        }catch (Exception e){

            System.out.println("Erro, digite um número válido");

        }

    }

}
