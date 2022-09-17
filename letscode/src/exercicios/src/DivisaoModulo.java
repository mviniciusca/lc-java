import java.util.Scanner;

public class DivisaoModulo {
    public static void main(String[] args) {
        System.out.println("Digite o dividendo: \n");
        Scanner input = new Scanner(System.in);
        double dividendo = input.nextDouble();
        System.out.println("Digite agora o divisor: \n");
        double divisor = input.nextDouble();
        double divisao = dividendo / divisor;
        double resto = dividendo % divisor;
        System.out.println((int) dividendo + "/" + (int) divisor + " = " + (int) divisao + " e com resto de:" + resto);
    }
}
