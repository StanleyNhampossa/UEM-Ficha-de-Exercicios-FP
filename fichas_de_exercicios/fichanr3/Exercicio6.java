package fichas_de_exercicios.fichanr3;

/*
6. Crie um programa que receba o tamanho dum array por inserção e em sequência dê a opcão de:
a) Inserir dados;
b) Pesquisar dados Inseridos;
c) Listar dados inseridos; e
d) Terminar execução.
 */

import java.util.Scanner;


public class Exercicio6 {

    public static void listData(int [] array){

        for(int a : array){
            System.out.print(a + " ");
        }
        System.out.println();

    }

    public static int searchData(int [] array, int dataToSearch){

        for (int i = 0; i < array.length; i++){
            if (dataToSearch == array[i])
                return i;
        }
        return -1;

    }

    public static int [] insertData(int length){
        Scanner read = new Scanner(System.in);
        int [] array = new int[length];

        System.out.println("Introduza os dados");
        for(int i = 0; i < length; i++){
            array[i] = read.nextInt();
        }

        return array;
    }


    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o tamanho do array");
        int length = read.nextInt();

        int [] array = new int[length];
        char option;

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Inserir Dados\n2 - Pesquisar dados inseridos\n3 - Listar dados inseridos\n4 - Terminar execução");
            option = read.next().charAt(0);

            switch (option){
                case '1': array = insertData(length);break;

                case '2': {
                    System.out.println("Introduza o dado que gostava de pesquisar");
                    int dataToSearch = read.nextInt();

                    if (searchData(array, dataToSearch) == -1){
                        System.out.println("Valor não encontrado");
                    }
                    else {
                        System.out.println("Valor encontrado na posição " + searchData(array, dataToSearch));
                    }
                }break;

                case '3': listData(array);break;

                case '4': System.out.println("Fim da execução");break;

                default: System.out.println("Digite uma opção válida");break;

            }

        }while(option != '4');

    }

}
