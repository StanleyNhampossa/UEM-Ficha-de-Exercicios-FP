package fichas_de_exercicios.fichanr7;

import java.io.Serializable;

public class Ex4_Modelo implements Serializable {

    private String nome;
    private String departamento;
    private String categoria;
    private double salario;
    private boolean status;

    public Ex4_Modelo(String nome, String departamento, String categoria, double salario, boolean status) {
        this.nome = nome;
        this.departamento = departamento;
        this.categoria = categoria;
        this.salario = salario;
        this.status = status;
    }

    public Ex4_Modelo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", categoria='" + categoria + '\'' +
                ", salario=" + salario +
                ", status=" + status +
                '}';
    }
}
