package entities;

import Programa.Calc_Media;

import java.util.Locale;
import java.util.Scanner;

public class ativ3_execfi {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calc_Media calc = new Calc_Media();
        System.out.print("Fale o nome e as 3 notas: ");
        calc.Nome = sc.next();
        calc.Nota1 = sc.nextDouble();
        calc.Nota2 = sc.nextDouble();
        calc.Nota3 = sc.nextDouble();

        System.out.println("Nota final: " + calc.noteFinal());
        if (calc.noteFinal() < 60){
            System.out.println("Negativo");
            System.out.println("Falta " + calc.verificador());
        }else {
            System.out.println("Positivo");
        }
    }
}
