import java.util.Scanner;

public class DescontoFrutas {
    /**
     * Altere o programa anterior para, ao invés de receber apenas o nome de uma
     * fruta para compra,
     * receber uma lista de frutas. Compare a lista de compras com a lista da
     * promoção e calcule o
     * desconto cumulativo de 5% para cada fruta correspondente. Ao final, informe
     * qual será o
     * desconto total (por exemplo, 3 itens correspondentes, resulta num desconto de
     * 15%). Exemplo:
     * A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
     * Qual a sua lista de compras para hoje?
     * mamão
     * uva
     * abacate
     * melancia
     * Você tem direito a um desconto de 5%. O mamão está em promoção!
     * 
     */
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Hotifruti Java");
        String[] frutasPromocao = { "banana", "maçã", "abacaxi", "melão", "mamão" };
        System.out.println("Qual a sua lista de compras de hoje?");
        try (Scanner input = new Scanner(System.in)) {
            String compra = input.nextLine(); // uva,maça,banana
            String[] listaCompra = compra.split(",");
            int cont = 0;
            for (String fruta : listaCompra) {
                for (String promofruta : frutasPromocao) {
                    if (promofruta.equalsIgnoreCase(fruta)) {
                        cont++;
                    }
                }
            }
            System.out.println("Você tem direito à " + cont * 5 + "% de desconto!");
        }

    }

}
