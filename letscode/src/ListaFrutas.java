import java.text.NumberFormat;
import java.util.Locale;

/**
 * Considere um aplicativo para solicitar sua feira de frutas. Você define a
 * lista de frutas desejada e
 * o comprador (pessoa que vai levar as compras até você) elabora a lista
 * contendo aquilo que ele
 * conseguiu comprar.
 * Seu desafio é elaborar um programa que calcula a gorjeta do comprador com
 * base na
 * correspondência entre o que foi pedido, e o que efetivamente foi comprado.
 * Seguindo os
 * seguintes parâmetros:
 * ● Compras correspondem à 50% ou mais da lista, gorjeta de R$ 3,00;
 * ● Compras correspondem à 75% ou mais da lista, gorjeta de R$ 5,00;
 * ● Compras correspondem à 90% ou mais da lista, gorjeta de R$ 10,00.
 * Exemplo de entrada: [“laranja”, “banana”, “uva”, “abacate”]; [“laranja”,
 * “uva”, “abacate”].
 * Resposta: correspondência de 75%, gorjeta de R$ 5,00.
 */
public class ListaFrutas {
    public static void main(String[] args) {
        // Definindo o Local
        Locale ptBr = new Locale("pt", "br");

        // Definindo a Lista
        String[] frutasDesejadas = { "Maçã", "Uva", "Banana", "Morango", "Pera", "Jaca", "Limão" };
        String[] frutasCompradas = { "Maçã", "Uva", "Banana" };

        // calculando a porcentagem
        int porcentagem = (frutasCompradas.length * 100) / frutasDesejadas.length;

        // calculando a gorjeta
        double gorjeta = 0;

        if (porcentagem >= 50 && porcentagem < 75) {
            gorjeta = 3;
        } else if (porcentagem >= 75 && porcentagem < 90) {
            gorjeta = 5;
        } else if (porcentagem >= 90) {
            gorjeta = 10;
        } else {
            gorjeta = 0;
        }

        // Trasnformando o valor da gorjeta
        String valorGorjeta = NumberFormat.getCurrencyInstance(ptBr).format(gorjeta);

        // Exibindo
        System.out.println("Correspondência de " + porcentagem + "%, gorjeta de " + valorGorjeta + " reais");

    }

}