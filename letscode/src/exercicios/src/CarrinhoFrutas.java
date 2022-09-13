import java.util.Arrays;
import java.util.Scanner;

public class CarrinhoFrutas {
    /**
     * Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de
     * compras. Ao final
     * da entrada dos 5 itens, exiba a lista completa. Exemplo:
     * Insira a sua lista de compras:
     * banana
     * maçã
     * abacaxi
     * melão
     * mamão
     * As frutas no seu carrinho são:
     * banana, maçã, abacaxi, melão, mamão
     * 
     * @param args
     */
    public static void main(String[] args) {

        String[] frutas = new String[5];
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Insira as frutas no carrinho:");
            for (int i = 0; i < frutas.length; i++) {
                frutas[i] = input.nextLine();
            }
            System.out.println("As frutas no seu carrinho são:");
            // for (String fruta : frutas) {
            // System.out.print(fruta + ", ");
            // }
            System.out.println(Arrays.toString(frutas).replace("[", "").replace("]", ""));
        }

    }

}
