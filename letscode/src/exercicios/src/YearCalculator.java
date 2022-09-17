
import java.time.LocalDate;
import java.util.Scanner;

public class YearCalculator {

    public static void main(String[] args) {

        LocalDate currentYear = LocalDate.now();
        int ano_atual = currentYear.getYear();

        String mensagem = "";

        System.out.println("Digite um ano para saber se é bissexto! \n");

        Scanner input = new Scanner(System.in);
        int ano = input.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            if (ano < ano_atual) {
                mensagem = "foi";
            } else if (ano == ano_atual) {
                mensagem = "é";
            } else {
                mensagem = "será";
            }
        } else {
            if (ano < ano_atual) {
                mensagem = "não foi";
            } else if (ano == ano_atual) {
                mensagem = "não é";
            } else {
                mensagem = "não será";
            }
        }

        System.out.printf("%nO ano de %s %s bissexto! %n", ano, mensagem);

    }

}
