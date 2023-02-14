package Programa;

import entities.Conv_dolar;

import java.util.Locale;
import java.util.Scanner;


public class ativ_statico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do dolar: ");
        Conv_dolar.dolar_ = sc.nextDouble();
        System.out.print("Informe o valor em real a ser convertido: ");
        Conv_dolar.valordeQuererdolar = sc.nextDouble();
        System.out.println("valor a pagar co IOF: "+ Conv_dolar.conversor());


    }
}
