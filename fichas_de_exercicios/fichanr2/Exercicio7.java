package fichas_de_exercicios.fichanr2;

/*
7. Escreva um programa que calcule a área de um triângulo, sendo que a altura e a base
devem ser fornecidas pelo utilizador.
 */

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o valor da base do triângulo");
        double base = ler.nextDouble();
        System.out.println("Introduza o valor da altura");
        double altura = ler.nextDouble();

        double areaDoTriangulo = base * altura / 2;

        System.out.println("A área do triângulo é " + areaDoTriangulo);

    }

}
