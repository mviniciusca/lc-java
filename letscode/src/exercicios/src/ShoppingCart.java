import java.util.Scanner;

public class ShoppingCart {

    /**
     * Vetor Insert and Show
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nBem-vindo ao Mercado!\nQuantos produtos deseja comprar?\n");

        int n = input.nextInt();
        String[] produtos = new String[n];

        System.out.println("\nÓtimo! Vamos comprar " + n
                + " produtos! Digite os " + n + " ítens abaixo e pressione enter \n");

        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = input.next();
        }

        System.out.println("\nSeus " + n + " produtos escolhidos foram:\n");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

    }
}
