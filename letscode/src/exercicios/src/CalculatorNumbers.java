import java.util.Scanner;

public class CalculatorNumbers {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");
        try (Scanner input = new Scanner(System.in)) {
            double a = input.nextDouble();
            System.out.println("Digite o segundo número: ");
            double b = input.nextDouble();

            double soma = a + b;
            double mult = a * b;
            double div = a / b;
            double sub = a - b;

            System.out.println("\n A soma dos números é igual a: " + soma);
            System.out.println("\n A subtração dos números é igual a: " + sub);
            System.out.println("\n A multiplicação dos números é igual a: " + mult);
            System.out.println("\n A divisão dos números é igual a: " + div);
        }
    }
}
