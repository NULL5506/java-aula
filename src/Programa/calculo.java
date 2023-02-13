package Programa;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;
public class calculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rt = new Retangulo();
        System.out.println("Bote os valores: ");
        rt.width = sc.nextDouble();
        rt.height = sc.nextDouble();

        System.out.println("Valor da area: "+ rt.Area());
        System.out.println("Valor do perimetro: "+ rt.Perimeter());
        System.out.println("Valor da diagonal: "+ rt.Diagonal());

    }
}

