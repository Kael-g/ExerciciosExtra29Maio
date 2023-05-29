import jdk.swing.interop.DispatcherWrapper;

import java.awt.desktop.SystemEventListener;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    //4. Faça um programa que receba uma quantidade X de números e imprimir o menor número (suponha números diferentes) entre eles Obs: use vetores para a resolução do exercício
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("Vamos calcular o menor e o maior valor entre alguns números digitados por você!");
        System.out.print("Quantos números você deseja digitar? ");
        int tamanho;
        for (tamanho = input.nextInt(); tamanho<0; tamanho = input.nextInt()){
            System.out.print("Não pode ser um valor negativo. Por favor, digite um valor válido: ");
        }
        if (tamanho > 0) {
            double[] numeros = new double[tamanho];
            for (int i = 0; i < tamanho; i++) {
                System.out.printf("Digite o %dº número: ", i + 1);
                numeros[i] = input.nextDouble();
            }

            System.out.println("Menor número digitado: " + df.format(minimo(numeros)));
            System.out.println("Maior número digitado: " + df.format(maximo(numeros)));
        } else {
            System.out.print("Nenhum número digitado, incapaz de calcular o maior e menor número.");
        }

    }

    public static double minimo(double[] numeros) {
        double menor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }
    public static double maximo(double[] numeros) {
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }

}
