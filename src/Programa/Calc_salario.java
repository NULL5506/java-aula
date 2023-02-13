package Programa;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Calc_salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Insira o nome: ");
        emp.Name = sc.next();
        System.out.print("Insira o salario bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Insira o a taxa: ");
        emp.Tax = sc.nextDouble();

        System.out.println(emp.Name + ", " + emp.NetSalary());
        System.out.print("Valor a ser aumentado");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println(emp);

    }
}
