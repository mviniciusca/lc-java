import java.util.Scanner;

/**
 * Média de altura e múltipla inclusão de dados
 */

public class UdemyThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nQuantos usuários serão cadastrados? ");
        int N = input.nextInt();

        System.out.println("---- Inicie o Cadastro ---- \n");

        int[] idades = new int[N];
        String[] nomes = new String[N];
        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("REGISTRO " + (i + 1) + " DE " + N);

            System.out.println("Nome: ");
            nomes[i] = input.next();

            System.out.println("Idade: ");
            idades[i] = input.nextInt();

            System.out.println("Altura: ");
            alturas[i] = input.nextDouble();

            System.out.printf("\nDados de %s cadastrados com sucesso!\n", nomes[i]);
            System.out.println("\n----------\n");

        }

        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma = soma + alturas[i];
        }

        double media = soma / N;
        System.out.println("Altura média: " + (double) media);

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                count++;
            }
        }

        double x = count * 100.0 / N;
        System.out.println("Percentual de pessoas com menos de 16 anos: " + x + "%");

    }

}
