import java.util.Scanner;

public class Ex3 {
    //3. Faça um algoritmo que contenha uma função que calcule o IMC de um usuário a partir da inserção do seu peso e de sua altura. Exiba a classificação do usuário após a verificação do seu IMC.
    //IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
    //      MENOR QUE 18,5 MAGREZA
    //      ENTRE 18,5 E 24,9 NORMAL
    //      ENTRE 25,0 E 29,9 SOBREPESO I
    //      ENTRE 30,0 E 39,9 OBESIDADE II
    //      MAIOR QUE 40,0 OBESIDADE GRAVE III
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA DE IMC");

        System.out.print("Qual é a sua altura, em metros? ");
        double altura;
        for (altura = input.nextDouble(); altura<0 || altura > 3; altura = input.nextDouble()){
            System.out.print("Valor inválido. Digite um valor válido (Ex: 1,60): ");
        }

        System.out.print("Qual é o seu peso, em quilos? ");
        double peso;
        for (peso = input.nextDouble(); peso<0; peso = input.nextDouble()){
            System.out.print("Valor inválido. Digite um valor válido (Ex: 70): ");
        }

        calculoImc(altura, peso);
    }

    public static void calculoImc(double altura, double peso){
        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("\nSeu IMC é de %.1f\nClassificação: ", imc);

        if (imc < 18.5){
            System.out.println("magreza");
        } else if (imc < 25){
            System.out.println("normal");
        } else if (imc < 30){
            System.out.println("sobrepeso I");
        } else if (imc < 40) {
            System.out.println("obesidade II");
        } else {
            System.out.println("obesidade grave III");
        }
    }
}
