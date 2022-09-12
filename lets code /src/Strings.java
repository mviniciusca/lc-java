
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        Locale BR = new Locale("pt", "BR");

        LocalDate hoje = LocalDate.now(); // obtendo o dia de hoje
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, BR));

    }
}