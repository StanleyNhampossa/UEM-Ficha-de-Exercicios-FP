package fichas_de_exercicios.fichanr3;

/*
5. Crie um programa que preencha um array[5], após o seu preenchimento permite que seja procurado
um elemento e se encontrado indica a sua posicão. O programa deve encerrar caso o número
procurado seja negativo
 */

import java.util.Scanner;

public class Exercicio5 {

    public static int findTheNumber(int [] array, int valueLookingFor){

        for(int i = 0; i < array.length; i++){

            if(valueLookingFor == array[i])
                return i;

        }

        return -1;
    }


    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int [] array = new int[5];

        System.out.println("Preencha os dados dentro do array");

        for(int i = 0; i < array.length; i++){
            array[i] = read.nextInt();
        }

        int valueLookingFor;

        do{

            System.out.println("Introduza o valor que gostava de procurar");
            valueLookingFor = read.nextInt();
            if(findTheNumber(array, valueLookingFor) == -1){
                System.out.println("Valor não encontrado");
            }
            else{
                System.out.println("Valor encontrado na posição " + findTheNumber(array, valueLookingFor));
            }


        }while(valueLookingFor >= 0);

    }

}
