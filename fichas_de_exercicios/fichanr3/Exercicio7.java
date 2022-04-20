package fichas_de_exercicios.fichanr3;

/*
7. Faça um programa para gerar os termos da seguinte P.G.: 3,9,27,81,..., calcule 0 100.o termo
 */

public class Exercicio7 {

    //Tipo incompatível de dado, não funciona devidamente

    public static long findTheTerm(int position){
        return 3*(long)Math.pow(3, position - 1);
    }

    public static void main(String[] args) {

        System.out.println("O termo da posição 100 é " + findTheTerm(100));

    }

}