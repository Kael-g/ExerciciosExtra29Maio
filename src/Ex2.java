import java.util.Scanner;

public class Ex2 {
    //2. Faça um algoritmo que contenha uma função que receba o nome de um usuário e retorne a mensagem Meu nome é <NomeDigitado>.
    public static void main(String[] args) {
        System.out.print("Qual é o seu nome? ");
        System.out.print(meuNome());
    }

    public static String meuNome(){
        Scanner input = new Scanner(System.in);

        String nome = input.next();

        return "Meu nome é " + nome;
    }
}
