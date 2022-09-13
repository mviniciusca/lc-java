import java.util.Scanner;

public class ListagemFrutas {
    /**
     * Um supermercado anuncia diariamente uma lista com 5 frutas em promoção.
     * Escreva um
     * programa que recebe o nome de uma fruta que você deseja comprar e informa se
     * a fruta
     * pertence à lista de promoções. Exemplo:
     * A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
     * Qual fruta você deseja comprar hoje?
     * banana
     * Ótima escolha! Essa fruta está em promoção hoje.
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Hotifruti Java");
        String[] frutasPromocao = { "banana", "maçã", "abacaxi", "melão", "mamão" };
        System.out.println("Qual fruta você quer comprar hoje?");
        Scanner input = new Scanner(System.in);
        String frutaCompra = input.nextLine();
        boolean frutaPromocao = false;

        for (String fruta : frutasPromocao) {

            if (fruta.equalsIgnoreCase(frutaCompra)) {
                frutaPromocao = true;
                break;
            }

        }
        if (frutaPromocao) {
            System.out.println("Fruta está em promoção hoje!");
        } else {
            System.out.println("A fruta não está em promoção hoje!");
        }
    }

}
