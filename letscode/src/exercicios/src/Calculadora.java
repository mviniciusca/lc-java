/**
 * Escreva um programa que informa a tabuada de multiplicação de um número
 * informado pelo
 * usuário (entre 1-10). Exemplo:
 * Entre com um número de 1 a 10:
 * 1
 * A tabuada de 1 é:
 * 1 x 1 = 1
 * 1 x 2 = 2
 * 1 x 3 = 3
 */

public class Calculadora {
    public static void main(String[] args) {
        calculadora(3);
    }

    public static void calculadora(int number) {
        if (number > 0 && number <= 10) {
            System.out.println("A Tabuada do " + number + " é: ");
            System.out.println("___________________");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + "x" + i + "=" + i * number);
            }
            System.out.println("___________________");
        } else {
            System.out.println("Número fora do parâmetro, por favor, digite um número de 1 a 10");
        }

    }

}
