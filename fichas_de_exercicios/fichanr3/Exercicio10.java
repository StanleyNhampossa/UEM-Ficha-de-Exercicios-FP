package fichas_de_exercicios.fichanr3;

/*
10. Faça um PROGRAMA para ler um valor X e um Valor N. Após a leitura, calcule a seguinte expressão:
 Y = (X + 1)/1! + (X + 2)/2! + (X + 3)/3! + (X + N)/N!
 */

import java.util.Scanner;

public class Exercicio10 {

    public static int calculateFactorial(int number){

        if(number == 0)
            return 1;

        else
            return number * calculateFactorial(number - 1);

    }



    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o valor de X");
        int x = read.nextInt();

        System.out.println("Introduza o valor de N");
        int n = read.nextInt();

        double y = 0;

        for(int i = 1; i <= n; i++){
            y+= (double) (x + i)/calculateFactorial(i);
        }

        System.out.println("O valor de y é " + y);

    }

}
