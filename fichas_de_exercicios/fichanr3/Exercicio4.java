package fichas_de_exercicios.fichanr3;

/*
 * 4. Crie um programa que dado um nome e apelido retorne as suas iniciais.
 * Ex: Entrada: Naruto Uzumaki; Saída: NU;
 *
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o seu nome e apelido");
        String name = read.nextLine();
        System.out.print(name.charAt(0));
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                System.out.print(name.charAt(i+1));
            }
        }


    }

}
