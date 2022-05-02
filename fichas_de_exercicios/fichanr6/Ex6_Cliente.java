package fichas_de_exercicios.fichanr6;

public class Ex6_Cliente {

    private Ex6_Conta conta;
    private String titular;

    public Ex6_Cliente(Ex6_Conta conta, String titular) {
        this.conta = conta;
        this.titular = titular;
    }

    public Ex6_Conta getConta() {
        return conta;
    }

    public void setConta(Ex6_Conta conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void listarCliente(){
        System.out.println("Titular " + titular);
        System.out.println("Tipo de conta " + conta.getTipoDaConta());
        System.out.println("Número da conta" + conta.getNumDeConta());
        System.out.println("Saldo actual " + conta.getSaldoActual());
    }

}
