import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    //5. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String nome = getNome();
        System.out.printf("Qual é o salário fixo de %s? ", nome);
        double salario = validaValor();
        System.out.printf("Qual é o total faturado pelas vendas de %s? ", nome);
        double vendas = validaValor();
        double salario_final = salario + 0.15*vendas;

        System.out.printf("\n\n%-45s%s\n","Nome do vendedor: ", nome);
        System.out.printf("%-45s%s\n","Salário fixo: ", ("R$ " + df.format(salario)));
        System.out.printf("%-45s%s\n","Salário final (+15% de comissão):", ("R$ " + df.format(salario_final)));
    }

    public static String getNome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o nome do vendedor? ");
        return input.nextLine();
    }
    public static double validaValor(){
        Scanner input = new Scanner(System.in);
        double num;

        for (num = input.nextDouble(); num<0; num = input.nextDouble()){
            System.out.print("O valor não pode ser negativo. Por favor, digite um valor válido: ");
        }
        return num;
    }
}
