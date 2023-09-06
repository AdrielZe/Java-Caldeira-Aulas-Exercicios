import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2,numero3;

        System.out.println("Digite um número: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        numero2 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        numero3 = entrada.nextInt();

        int biggestNumber = Math.max(numero1,Math.max(numero2,numero3));
        int smallestNumber= Math.min(numero1,Math.min(numero2,numero3));

        System.out.println("O número maior é: " + biggestNumber);
        System.out.println("O número menor é: " + smallestNumber);
        System.out.println("A média aritmética é: " + (numero1+numero2+numero3)/3 );

    }
}