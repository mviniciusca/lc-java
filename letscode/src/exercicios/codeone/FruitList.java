import java.util.Scanner;

public class FruitList {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Hortifruti! Qual fruta deseja comprar?");

        Scanner sc = new Scanner(System.in);
        String frutaDesejada = sc.nextLine();
        String[] frutasPromocao = { "uva", "maçã", "banana", "pera", "morango" };
        boolean promocao = false;

        for (String fruta : frutasPromocao) {
            if (fruta.equalsIgnoreCase(frutaDesejada)) {
                promocao = true;
                break;
            }
        }

        if (promocao) {
            System.out.println("A fruta está em promoção!");
        } else {
            System.out.println("Hoje a fruta não está em promoção!");
        }

        sc.close();
    }

}
