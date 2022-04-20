package fichas_de_exercicios.fichanr3;

/*
8. Faça	um	PROGRAMA	para:
a) Ler um valor X e um valor N;
b) Calcular: Y = X - 2X + 4X - 6X + 8X - 10X + ... + NX
 */

import java.util.Scanner;

public class Exercicio8_9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o valor de x");
        int x = read.nextInt();

        System.out.println("Introduza o valor de n");
        int n = read.nextInt();

        int y = x;

        for(int i = 1; i <= n/2; i++){
            if(i % 2 == 0){
                y += 2*i*x;
            }
            else {
                y -= 2*i*x;
            }

        }
        System.out.println("O valor do y é " + y);


    }
}
