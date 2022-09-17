package topics;

public class Funcoes {

    public static void main(String[] args) {

        int[] z = { 10, 5 };

        System.out.println(media(z));

    }

    public static float media(int[] x) {

        float media = 0;

        for (int i = 0; i < x.length; i++) {
            media += x[i];
        }

        media = (float) media / x.length;

        return media;
    }
}