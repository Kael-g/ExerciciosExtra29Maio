import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    //7. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("CONVERSOR DOLAR ---> REAL");
        System.out.print("Digite quantos dólares você possui: ");
        double dolar = validaValor();
        System.out.printf("Digite quantos reais está valendo US$ 1,00 (um dólar): ");
        double cotacao = validaValor();

        System.out.printf("\nUS$ %s = R$ %s", df.format(dolar), df.format(convertDolarToReal(dolar,cotacao)));
    }

    public static double validaValor(){
        Scanner input = new Scanner(System.in);
        double num;

        for (num = input.nextDouble(); num<0; num = input.nextDouble()){
            System.out.print("O valor não pode ser negativo. Por favor, digite um valor válido: ");
        }
        return num;
    }
    public static double convertDolarToReal(double dolar, double cotacao){
        return dolar*cotacao;
    }
}
