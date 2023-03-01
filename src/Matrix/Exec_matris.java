package Matrix;

import java.util.Locale;
import java.util.Scanner;

public class Exec_matris {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeros");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Numero: ");
        int var = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == var) {
                    System.out.println("Position: " + i +", "+ j + " ");
                    if (j > 0) {
                        System.out.println("esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("cimasturbo: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("baixin: " + mat[i+1][j]);
                    }
                }
            }

        }
    }
}
