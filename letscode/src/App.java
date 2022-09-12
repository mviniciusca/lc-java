public class App {
    public static void main(String[] args) throws Exception {

        boolean status = true;
        String mensagem = status ? "Vamos" : "Não vamos";

        System.out.println(mensagem + " a praia!");
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static boolean variavel() {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;

        /**
         * true && true = true
         * true && false = false
         * false && true = false
         * false && false = false
         */
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        return vamosAPraia;

    }

    public static boolean pipe() {

        /**
         * true || true = true
         * true || false = true
         * false || true = true
         * false || false = false
         */

        boolean status = false;
        boolean info = true;

        boolean condic = status || info;

        return condic;

    }

    public static void ternario() {

        /**
         * * Usa o ? para checar uma condição
         * ternário poois há tres termos
         */

    }
}
