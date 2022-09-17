package topics;

public class Vetores {
    public static void main(String[] args) {

        // int[] numeros = new int[5];
        // numeros[0] = 1;
        // numeros[1] = 2;
        // numeros[2] = 3;
        // numeros[3] = 4;
        // numeros[4] = 5;

        // for (int i = 0; i < numeros.length; i++) {
        // System.out.println(numeros[i]);
        // }

        // String[] frutas = { "Banana", "Pera", "Uva" };

        // System.out.println(Arrays.toString(frutas));
        //

        int[] numeros = { 9, 10, 12, 25, 2 };
        int menor = numeros[0];
        int maior = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media = media + numeros[i];

        }

        System.out.println("Maior => " + maior);
        System.out.println("Menor => " + menor);
        System.out.println("Media => " + (float) media / numeros.length); // media são numeros inteiros e o resultado é
                                                                          // float, então temos que fazer o cast;

    }

}