import java.util.Scanner;

public class UdemyOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] vet = new int[n];

        // armazena os números
        for (int i = 0; i < vet.length; i++) {
            vet[i] = input.nextInt();
        }

        // lista os números
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }

        }

    }

}
