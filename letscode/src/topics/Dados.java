
/**
 * Manipulação de Dados
 * O Java oferece diversos métodos para manipulação dos dados em geral.
 */

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Dados {

    /**
     * Manipulação de Strings e Datas
     */
    public static void main(String[] args) {

        // Olá {nome}. Hoje é {dia-da-semana, {saudação}!

        // Nome e Sobrenome
        String nome = "Marcos";
        String sobrenome = "Coelho";

        // definindo data e hora
        Locale brasil = new Locale("pt", "br");

        LocalDate hoje = LocalDate.now();
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora = LocalDateTime.now();

        String saudacao;

        // condicionando a saudação

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Ola!";
        }

        // montando a exibição
        System.out.printf("Olá %s %s. Hoje é %s, %s %n", nome, sobrenome, diaDaSemana, saudacao.toUpperCase());

    }
}