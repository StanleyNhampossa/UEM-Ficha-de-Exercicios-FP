package fichas_de_exercicios.fichanr6;

public class Ex6_Conta {

    private int numDeConta;
    private double saldoActual;
    private String tipoDaConta;

    public Ex6_Conta(int numDeConta, double saldoActual, String tipoDaConta) {
        this.numDeConta = numDeConta;
        this.saldoActual = saldoActual;
        this.tipoDaConta = tipoDaConta;
    }

    public int getNumDeConta() {
        return numDeConta;
    }

    public void setNumDeConta(int numDeConta) {
        this.numDeConta = numDeConta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }



}
