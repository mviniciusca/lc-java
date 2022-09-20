import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Hortifruti! Qual a lista de compras hoje?");

        Scanner sc = new Scanner(System.in);
        String[] produtosDisponiveis = { "uva", "banana", "mamão", "morango", "limão", "pêra", "goiaba" };
        String[] listaCompras = new String[3];
        for (int i = 0; i < listaCompras.length; i++) {
            listaCompras[i] = sc.next();
        }

        int count = 0;

        String[] produtosPromocao = new String[listaCompras.length];

        for (String itensCompra : listaCompras) {
            for (String itensDisponiveis : produtosDisponiveis) {
                if (itensCompra.equalsIgnoreCase(itensDisponiveis)) {
                    produtosPromocao[count++] = itensCompra;
                    break;
                }
            }
        }

        int desconto = count * 5;
        System.out.print("Você tem direito à " + desconto + ". As frutas em promoção são: ");
        for (int i = 0; i < produtosPromocao.length; i++) {
            System.out.print(produtosPromocao[i] + ",");
        }
        sc.close();

    }

}
