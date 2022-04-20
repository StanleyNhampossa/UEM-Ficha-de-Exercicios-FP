package fichas_de_exercicios.fichanr1;
/*
8. Faça um programa que calcule as raízes de uma equação quadrática
 */

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o valor de a na equação equação quadrática");
        double a = ler.nextDouble();
        System.out.println("Introduza o valor de b na equação equação quadrática");
        double b = ler.nextDouble();
        System.out.println("Introduza o valor de c na equação equação quadrática");
        double c = ler.nextDouble();

        double delta = (double) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não tem raízes reais");
        }

        else
            if (delta == 0){
                double x = (double) (( -b + Math.sqrt(delta)) / 2 * a);
                System.out.println("A equação tem raíz dupla\nX1 = X2 = " + x);
            }

            else {
                double x1 = (double) (( -b + Math.sqrt(delta)) / 2 * a);
                double x2 = (double) (( -b - Math.sqrt(delta)) / 2 * a);
                System.out.println("A equação tem raízes distintas\nX1 = " + x1 + " X2 = " + x2);
            }

    }

}
