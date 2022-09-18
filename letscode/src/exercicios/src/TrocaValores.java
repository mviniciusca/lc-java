
import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            System.out.println("Agora digite outro número inteiro: ");
            int b = input.nextInt();
            System.out.print("\033\143");
            System.out.println("Antes da troca: A = " + a + "; B = " + b);
            int aux = a;
            a = b;
            b = aux;
            System.out.println("Após a troca: A = " + a + "; B = " + b);
        }

    }
}