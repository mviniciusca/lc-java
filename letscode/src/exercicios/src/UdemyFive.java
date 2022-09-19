import java.util.Scanner;

/**
 * Insira dados e depois leia-os;
 * foreach exercicio
 */

public class UdemyFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            x = input.nextInt();
        }
        System.out.println(soma);
    }

}
