package fichas_de_exercicios.fichanr1;
/*
1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.

 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade no formato ano, meses e dias");
        System.out.println("Digite os anos");
        int anos = ler.nextInt();
        System.out.println("Digite os meses");
        int meses = ler.nextInt();
        System.out.println("Digite os dias");
        int dias = ler.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("A sua idade em dias é " + idadeEmDias);



    }

}
