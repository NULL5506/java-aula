import java.util.Locale;
import java.util.Scanner;

public class exercicio_imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("fale um numero");
        double salario,calc;
        salario = sc.nextDouble();

        if(salario < 2000) {
            System.out.println("isento mano");
        }
        else if (salario > 2000 && salario < 3000){
            calc = (salario - 2000) * 0.08;
            System.out.println("total da taxa: " + calc);
        }
        else if (salario > 3000 && salario < 4500){
            calc = (salario -3000) * 0.18;
            System.out.printf("total da taxa: %.2f", 1000 * 0.08+calc);
        }
        else if (salario > 4500){
            calc = (salario - 4500) * 0.28;
            System.out.printf("total da taxa: %.2f", calc+ 1000 * 0.08 + 1500 *0.18);
        }
        sc.close();
    }
}