import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {
//    6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.println("CONVERSOR CELSIUS ---> FARENHEIT");

        System.out.print("Digite a medida em ºC (somente números): ");
        double celsius = input.nextDouble();

        System.out.printf("\n%sºC = %sºF", df.format(celsius), df.format(convertCelsiusToFarenheit(celsius)));
    }

    public static double convertCelsiusToFarenheit (double celsius){
        return (9*celsius + 160)/5;
    }
}
