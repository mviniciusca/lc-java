package topics;

public class EstruturaCondicionais {
    public static void main(String[] args) {

        // nota do aluno
        int nota = 70;
        String graduacao;

        // nota maior que 70, aluno aprovado

        if (nota >= 70) {
            // System.out.println("Aluno aprovado");
        } else {
            // System.out.println("Aluno reprovado");
        }

        // mais condições

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        // swhitch

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Graduação Inválida");

        }
    }
}