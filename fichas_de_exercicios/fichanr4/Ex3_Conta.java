package fichas_de_exercicios.fichanr4;

public class Ex3_Conta {

    private String titular;
    private int numeroDeConta;
    private double saldo = 200;
    private double taxaDeOperacao = 8;
    private boolean status;

    public Ex3_Conta(String titular, int numeroDeConta, boolean status){

        this.titular = titular;
        this.numeroDeConta = numeroDeConta;
        this.status = status;

    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public int getNumeroDeConta(){
        return numeroDeConta;
    }

    public void setNumeroDeConta(int numeroDeConta){
        this.numeroDeConta = numeroDeConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getTaxaDeOperacao(){
        return taxaDeOperacao;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void withdrawMoney(double moneyToDraw){

        if(moneyToDraw < (saldo + taxaDeOperacao) && status == true)
            saldo -= moneyToDraw + taxaDeOperacao;
        else
            System.out.println("Não tem dinheiro suficiente para levantar");
    }

    public void depositeMoney(double moneyToDeposite){
        if(moneyToDeposite > 0 && status == true){
            saldo += moneyToDeposite;
        }
        else{
            System.out.println("O valor a depositar deve ser maior que 0");
        }

    }

    public void seeCredit(){
        if(status == true) {
            System.out.println("O seu saldo é " + saldo);
        }
    }

    public void printData(){
        if(status == true) {
            System.out.println("O titular da conta é " + titular);
            System.out.println("O número da conta é " + numeroDeConta);
            System.out.println("O saldo é " + saldo);
            System.out.println("O status é " + status);
        }
    }

    public boolean printDataA(){
        if(status == true) {
            System.out.println("O titular da conta é " + titular);
            System.out.println("O número da conta é " + numeroDeConta);
            System.out.println("O saldo é " + saldo);
            System.out.println("O status é " + status);
        }
        return false;
    }

    public void desactiveAccount(){
        status = false;
    }

    public void activeAccount(){
        status = true;
    }


}
