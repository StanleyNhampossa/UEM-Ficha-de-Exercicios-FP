package fichas_de_exercicios.fichanr6;

import Hermon.Ex;

import java.util.Date;

public class Ex2_Agricultor implements Comparable {

    private String nome;
    private String dataDeNascimento;
    private String especializacao;
    private String culturaFavorita;

    public Ex2_Agricultor(){};
    public Ex2_Agricultor(String nome, String dataDeNascimento, String especializacao, String culturaFavorita){

        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.especializacao = especializacao;
        this.culturaFavorita = culturaFavorita;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getCulturaFavorita() {
        return culturaFavorita;
    }

    public void setCulturaFavorita(String culturaFavorita) {
        this.culturaFavorita = culturaFavorita;
    }

    public void dadosAgricultor(){

        System.out.println("Nome : " + nome);
        System.out.println("Data de nascimento : " + dataDeNascimento);
        System.out.println("Especialização : " + especializacao);
        System.out.println("Cultura favorita : " + culturaFavorita);

    }




    public boolean mesmasEspecialicoes(String especializacao1, String especializacao){
        //for(int i = 0)
        if(especializacao1.equalsIgnoreCase( especializacao))
            return true;

        return false;


    }


    public int compareTo(Object o){

        Ex2_Agricultor outro = (Ex2_Agricultor) o;

        if(especializacao.equalsIgnoreCase(outro.especializacao)){
            return 1;
        }

        return 0;
    }

/*
    @Override
    public int compareTo(Object o) {

        Ex2_Agricultor outro = (Ex2_Agricultor) o;

        if(especializacao.equalsIgnoreCase(outro.especializacao)){
            return 1;
        }

        return 0;
    }

 */
}
