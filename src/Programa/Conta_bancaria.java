package Programa;

import entities.Calc_bank;

import java.util.Locale;
import java.util.Scanner;


public class Conta_bancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calc_bank calc = new Calc_bank();
        System.out.print("Para criar a conta informe \n");
        System.out.print("Numero da conta: ");
        Calc_bank.nunConta = sc.nextInt();
        System.out.print("informe o nome do dono: ");
        Calc_bank.nomeConta = sc.nextLine();
        System.out.print("Deseja fazer o deposito inicial ?: ");
        String depInicial = sc.next().toLowerCase();

        if (depInicial.equals("sim")){
            System.out.print("Valor a ser depositado: ");
            Calc_bank.valDeposito = sc.nextDouble();
            calc.Deposito(Calc_bank.valDeposito);
            System.out.println(calc);
        }else {
            System.out.println(calc);
        }System.out.print("Qual valor o senhor deseja depositar ?: ");
        Calc_bank.valDeposito = sc.nextDouble();
        calc.Deposito(Calc_bank.valDeposito);
        System.out.println(calc);

        System.out.print("Valor a ser sacado: ");
        Calc_bank.valSaque = sc.nextDouble();
        calc.Saque(Calc_bank.valSaque);
        System.out.println(calc);
    }
}
