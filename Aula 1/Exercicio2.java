import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2;

        System.out.println("Digite um número: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        numero2 = entrada.nextInt();

        System.out.println("Você digitou os números " + numero1 + " e " + numero2);
    }
}