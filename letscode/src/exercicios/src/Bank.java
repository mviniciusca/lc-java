
import java.time.LocalDateTime;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        String saudacao = "";

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 13 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        }

        System.out.println("\n- - - " + saudacao + " Bem-vindo ao App do Banco Poupança! - - - \n ");

        double saldo = 1000.00;
        double poupanca = 500.00;
        double valor;

        int i = 0;

        while (i != 3) {
            System.out.println("Digite 1 para APLICAR, 2 para RESGATAR ou 3 para SAIR \n");
            Scanner input = new Scanner(System.in);
            i = input.nextInt();

            if (i == 1) {
                System.out.println("Digite o valor da sua aplicação: ");
                valor = input.nextDouble();
                if (valor > saldo) {
                    System.out.println("Salado de Conta Corrente Insuficiente!");
                } else {
                    saldo = saldo - valor;
                    poupanca = poupanca + valor;
                    System.out.println(
                            "\n Aplicação realizada com sucesso! \n Saldo: " + saldo + " Poupança: " + poupanca + "\n");
                }
            }
            if (i == 2) {
                System.out.println("Digite o valor do seu resgaste: ");
                valor = input.nextDouble();
                if (valor > poupanca) {
                    System.out.println("Saldo insuficiente na poupança!");
                } else {
                    saldo = saldo + valor;
                    poupanca = poupanca - valor;
                    System.out.println(
                            "\n Resgate realizado com sucesso! \n Saldo: " + saldo + " Poupança: " + poupanca + "\n");
                }
            }
            if (i == 3) {
                System.out.println("Saindo do Aplicativo! \n");
                System.out.print("\033\143");
            }

        }

    }

}