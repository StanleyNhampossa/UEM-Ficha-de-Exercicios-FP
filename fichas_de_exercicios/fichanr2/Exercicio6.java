package fichas_de_exercicios.fichanr2;

/*
6. Escreva um programa que mostre uma mensagem de boas-vindas, composta pelo nome
e a idade do utilizador
 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza o seu nome");
        String nome = ler.nextLine();
        System.out.println("Introduza a sua idade");
        int idade = ler.nextInt();

        System.out.println("Bem vindo "+ nome + ". Você tem " + idade + " anos");

    }

}
