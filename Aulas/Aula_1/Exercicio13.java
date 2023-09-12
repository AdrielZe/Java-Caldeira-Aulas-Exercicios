package Aula_1;

import java.util.Scanner;
public class Exercicio13 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Digite um número para obter o resultado de seu fatorial: ");
        number = input.nextInt();

        System.out.println("O fatorial de " + number + " é " + Exercicio13Fatorial.calculateFactorial(number));
        input.close();
    }
}
