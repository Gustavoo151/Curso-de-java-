import java.util.Scanner;

public class LeituraDadosTeclado{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);  // Pegando a entrada padrão do sistema (Teclado)

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();  // Atribuindo o valor lido na variável nome
        
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt(); // Atribuindo um valor inteiro a variável a partir do teclado

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble(); // Atribuindo um valor double a partir do teclado

        System.out.println("NextLine: " + nome);
        System.out.println("NextInt: " + idade);
        System.out.println("NextDouble: " + altura);

    }
}