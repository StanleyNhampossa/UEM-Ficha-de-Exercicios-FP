package fichas_de_exercicios.fichanr6;

public class Ex4_Vendedor {

    private String nomeDoVendedor;
    private String dataDeNascimento;
    private String tipoDeProduto;
    private int numeroDeVendas;
    private int quantidadeDeProdutosVendidos;
    private double salario;

    public Ex4_Vendedor(String nomeDoVendedor, String dataDeNascimento, String tipoDeProduto, int numeroDeVendas, int quantidadeDeProdutosVendidos, double salario) {
        this.nomeDoVendedor = nomeDoVendedor;
        this.dataDeNascimento = dataDeNascimento;
        this.tipoDeProduto = tipoDeProduto;
        this.numeroDeVendas = numeroDeVendas;
        this.quantidadeDeProdutosVendidos = quantidadeDeProdutosVendidos;
        this.salario = salario;
    }

    public String getNomeDoVendedor() {
        return nomeDoVendedor;
    }

    public void setNomeDoVendedor(String nomeDoVendedor) {
        this.nomeDoVendedor = nomeDoVendedor;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public int getQuantidadeDeProdutosVendidos() {
        return quantidadeDeProdutosVendidos;
    }

    public void setQuantidadeDeProdutosVendidos(int quantidadeDeProdutosVendidos) {
        this.quantidadeDeProdutosVendidos = quantidadeDeProdutosVendidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void efectuarVenda(String nomeDoProduto, int quantidade){



    }

    public void dadosVendedor(){
        System.out.println("Nome " + nomeDoVendedor);
        System.out.println("Data de nascimento " + dataDeNascimento);

    }

    public void aumentarSalario(){

    }

    public void melhorVendedor(){

    }


}
