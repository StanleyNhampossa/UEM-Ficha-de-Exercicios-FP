package fichas_de_exercicios.fichanr6;

import java.util.Arrays;
import java.util.Date;

public class Ex3_Teste {

    public static void main(String[] args) {

        Ex2_Agricultor [] agricultor = new Ex2_Agricultor[4];

        agricultor[0] = new Ex2_Agricultor("Milton", "10/02/1987", "Eng. Agrónomo", "milho");
        agricultor[1] = new Ex2_Agricultor("Luís", "14/02/1990", "Eng. Florestal", "arroz");
        agricultor[2] = new Ex2_Agricultor("Hermon", "07/09/1960", "Eng. Agrónomo", "feijão");
        agricultor[3] = new Ex2_Agricultor("Edilson", "10/10/1954", "Agricultor", "trigo");
        //Arrays.sort(agricultor);
        /*for(int i = 0; i < agricultor.length; i++){

            for (int j = 0; j < agricultor.length; j++){

                if(!agricultor[i].mesmasEspecialicoes(agricultor[i].getEspecializacao(), agricultor[j].getEspecializacao())){
                    agricultor[i].dadosAgricultor();
                }

            }

        }

         */
        /*
        for(int i = 0; i < agricultor.length; i++) {
            for (int j = i + 1; j < agricultor.length; j++) {
                if (agricultor[i].mesmasEspecialicoes(agricultor[i].getEspecializacao(), agricultor[j].getEspecializacao())   );
                    agricultor[i].dadosAgricultor();
            }
        }

         */
        Ex2_Agricultor a = new Ex2_Agricultor();

        for(int i = 0; i < agricultor.length; i++){
            if (a.compareTo(agricultor[i]) == 1){
                agricultor[i].dadosAgricultor();
            }
        }
    }

}
