/**
 * Escreva um programa que converte temperaturas de Celsius para Fahrenheit.
 * Fórmula (0 °C × 9/5) + 32 = 32 °F. Exemplo:
 * Entre com uma temperatura em Celsius para saber seu equivalente em
 * Fahrenheit:
 * 22
 * O equivalente a 22 C é 71,6 F.
 */

public class ConversorTemperatura {
    public static void main(String[] args) {
        conversor(22);
    }

    public static void conversor(double temperature) {

        double formula = (temperature * 9 / 5) + 32;

        String result = Double.toString(formula).replace(".", ",");
        System.out.println("O equivalente a " + temperature + " C é " + result + " F");

    }

}
