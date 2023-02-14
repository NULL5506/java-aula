package entities;

public class Calc_bank {
    public static int nunConta;
    public static String nomeConta;
    public static double valDeposito;
    public static double valSaque;
    public static double saldo;
    public void Deposito (double saldo){
        this.saldo += saldo;
    }public void Saque(double saldo){
        this.saldo -= saldo;
    }
    public String toString() {
        return "Numero da conta: " + nunConta + "\n Nome do dono da conta: "+ nomeConta + "\n Saldo da conta: " + String.format("%.2f",saldo);
    }

}
