package Lista_exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exec_lista1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero");
        int n = sc.nextInt();

        List<Integer> id = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Double> salario = new ArrayList<>();


        for(int i = 0; i<n; i++){
            System.out.print("ID: ");
            id.add(sc.nextInt());
            System.out.print("Name: ");
            sc.nextLine();
            name.add(sc.nextLine());
            System.out.print("Salary: ");
            salario.add(sc.nextDouble());
        }
        System.out.print("id que tu queres mudar: ");
        int var = sc.nextInt();
        int indexId = id.indexOf(var);
        if(id.contains(var)){
            System.out.print("Quantos por cento: ");
            double tempVar = sc.nextDouble();
            double calc = salario.get(indexId) * tempVar/100 + salario.get(indexId);
            salario.set(indexId, calc);
        }else{
            System.out.print("esse id nao existe");
        }
        for (Integer x : id){
            System.out.println(x);
        }
        for (String x : name) {
            System.out.println(x);
        }
        for (Double x : salario) {
            System.out.println(x);
        }


    }
}
