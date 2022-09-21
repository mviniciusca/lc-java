import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        /**
         * * Matrizes / Vetores Bidimensional
         * Também chamadas de arranjos bidimensionais ( arrys bidimensionais )
         * Alocamento fixo que deve ser informado na declaração da matriz
         * Primeiro a declaração, depois a inicialização.
         */

        double[][] mat; // inicialização
        mat = new double[3][4]; // declaração

        /**
         * Saída do exemplo acima:
         * 
         * [00][01][02][03]
         * [10][11][12][13]
         * [20][21][22][23]
         * 
         * onde que:
         ** o primeiro número é a linha do vetor bidimensional
         ** e o segundo número é a coluna do vetor bidimensional
         */

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
