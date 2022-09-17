import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: \n");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        System.out.println("O número digitado foi: " + numero + "\n");
    }
}
