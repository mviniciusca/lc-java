
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

        // Definindo a Lista
        String[] frutasDesejadas = { "Maçã", "Uva", "Banana", "Morango", "Abacaxi", "Pêra" };
        String[] frutasCompradas = { "Maçã", "Uva" };

        // calculando a porcentagem
        int porcentagem = (frutasCompradas.length * 100) / frutasDesejadas.length;

        // calculando a gorjeta
        int gorjeta = 0;

        if (porcentagem <= 50) {
            gorjeta = 3;
        } else if (porcentagem <= 75) {
            gorjeta = 5;
        } else if (porcentagem <= 90) {
            gorjeta = 10;
        } else {
            gorjeta = 0;
        }

        System.out.println(porcentagem + "% de frutas compradas!" + "Sua gorjeta é de R$ " + gorjeta);
    }

}