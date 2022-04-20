package fichas_de_exercicios.fichanr6;

import java.util.Date;

public class Agricultor {

    private String nome;
    private Date dataDeNascimento;
    private String especializacao;
    private String culturaFavorita;

    public Agricultor(String nome, Date dataDeNascimento, String especializacao, String culturaFavorita){

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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
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

    }




}
