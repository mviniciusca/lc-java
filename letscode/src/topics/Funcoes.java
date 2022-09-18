/**
 * Funções
 * Funções são pequenos trechos de códigos que podem ser reutilizados em
 * qualquer parte do
 * nosso projeto.
 * 
 * Facilitando assim além da escrita, a manutenção.
 * O Java fornece diversas funções, porém, nós podemos criar as nossas prórpias
 * funções.
 */

public class Funcoes {

    /**
     * Função Main
     * Função Principal da Aplicação
     * 
     * @param args
     */

    public static void main(String[] args) {
        int[] z = { 10, 5 };
        System.out.println(media(z));
    }

    /**
     * Função Média
     * Calcula a média entre 1 ou mais números e retorna um array com os dados do
     * resultado da operação.
     * 
     * @param x
     * @return
     */

    public static float media(int[] x) {
        float media = 0;
        for (int i = 0; i < x.length; i++) {
            media += x[i];
        }
        media = (float) media / x.length;
        return media;
    }
}