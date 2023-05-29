import java.util.Scanner;

public class Ex1 {
    //1. Faça um algoritmo que contenha um método que receba um número do usuário e realize a somatório de todos os números no intervalo de 1 até o número digitado pelo usuário. Exiba o resultado final da somatória.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos realizar o somatório de 1 até um número inteiro qualquer!");
        System.out.print("Digite o número: ");
        int numero = input.nextInt();

        if (numero >= 1) {
            System.out.printf("\nA soma dos números no intervalo de 1 a %d é igual a %d", numero, soma(numero));
        } else {
            System.out.printf("\nA soma dos números no intervalo %d a 1 é igual a %d", numero, soma(numero));
        }
    }
    public static int soma(int n){
        int total = 1;
        if (n>=1){
            for (int i = 2; i <= n; i++){
                total += i;
            }
        } else {
            for (int i = 0; i >= n; i--){
                total += i;
            }
        }
        return total;
    }
}
