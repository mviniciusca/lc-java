import java.util.Scanner;

public class MatrizCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // linhas
        int N = sc.nextInt(); // colunas

        double[][] mat = new double[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        double[] vet = new double[M];
        for (int i = 0; i < M; i++) {
            double soma = 0.0;
            for (int j = 0; j < M; j++) {
                soma = soma + mat[i][j];
            }
            vet[i] = soma;
        }

        for (int i = 0; i < M; i++) {
            System.out.printf("%.1f%n", vet[i]);
        }

        sc.close();

    }
}