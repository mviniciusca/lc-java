import java.util.Scanner;

/**
 * Insira dados e depois leia-os;
 * foreach exercicio
 */

public class UdemyFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        String[] nomes = new String[N];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = input.next();
        }

        System.out.println("Nomes lidos: ");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
