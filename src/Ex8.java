import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {
    //8. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dinheiro = new DecimalFormat("#,###.00");
        DecimalFormat menorPossivel = new DecimalFormat("#.##");

        System.out.println("CALCULAR VALOR DE VENDA DE ACORDO COM O PERCENTUAL DESEJADO");
        System.out.print("Digite o preço de custo do seu produto: ");
        double preco_de_custo = validaValor();
        System.out.print("Digite o percentual de acréscimo desejado (Ex: 50 para 50%): ");
        double percentual = validaValor();
        double preco_final = preco_de_custo + calculaAcrescimo(preco_de_custo,percentual);

        System.out.printf("O produto deve ser vendido por R$ %s para obter %s%% de lucro.", dinheiro.format(preco_final), menorPossivel.format(percentual));
    }
    public static double validaValor(){
        Scanner input = new Scanner(System.in);
        double num;

        for (num = input.nextDouble(); num<0; num = input.nextDouble()){
            System.out.print("O valor não pode ser negativo. Por favor, digite um valor válido: ");
        }
        return num;
    }

    public static double calculaAcrescimo(double valor_inicial, double percentual){
        return valor_inicial*percentual/100;
    }
}
