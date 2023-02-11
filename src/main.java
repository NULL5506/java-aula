import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int n, cont,calc;
    n =sc.nextInt();
    calc =0;
    for(int y=1;y<n+1;y++){
        calc = (int) Math.pow(y,2);
        cont = (int) Math.pow(y,3);
        System.out.printf("%d %d %d \n",y, calc, cont);
    }

    }
}
