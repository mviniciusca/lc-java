
import java.util.Scanner;

public class ExchangeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencyNames = { "dolar", "euro", "peso", "rublo", "libra" };
        Double[] currencyValue = { 5.15, 5.13, 0.036, 0.084, 5.85 };

        double curr_value = 0.0;

        for (Double currency : currencyValue) {
            if (currency >= 1.0) {
                curr_value = currency * 100.00;
                System.out.println(curr_value);
            }
        }

    }
}
