package fichas_de_exercicios.fichanr1;
/*
6. Faça um programa que receba 3 valores que representarão os lados de um triângulo e
verifique se os valores formam um triângulo e classifique esse triângulo como: eqüilátero
(3 lados iguais); isósceles (2 lados iguais); escaleno (3 lados diferentes).

 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o primeiro lado");
        int lado1 = ler.nextInt();
        System.out.println("Introduza o primeiro lado");
        int lado2 = ler.nextInt();
        System.out.println("Introduza o terceiro lado");
        int lado3 = ler.nextInt();

        if( (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1) ){

            if( (lado1 == lado2) && (lado2 == lado3) ){
                System.out.println("O triângulo é equilátero");
            } else
                if( (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
                    System.out.println("O triângulo é escalêno");
            }
                else{
                    System.out.println("O triângulo é isósceles");
                }

        } else {
            System.out.println("As medias dos lados não correspondem a de um triângulo");
        }



    }

}
