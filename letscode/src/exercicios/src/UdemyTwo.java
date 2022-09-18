import java.util.Scanner;

public class UdemyTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        double[] vet = new double[N];

        // cria o vetor
        for (int i = 0; i < N; i++) {
            vet[i] = input.nextDouble();
        }

        // lista todos os números
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        // soma
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma = soma + vet[i];
        }
        System.out.printf("%s\n", soma);

        // media
        double media = soma / N;
        System.out.println(media + "\n");

    }

}
