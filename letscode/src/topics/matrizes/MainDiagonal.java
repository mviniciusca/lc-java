import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        int count = 0;

        // feeding main
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // main diagonal
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < m; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        // count negative number
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Quantidade de negativos = " + count);
        sc.close();
    }
}