package Aula_2;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, lastNumber;

        System.out.println("Quero gerar números primos a partir do número: ");
        firstNumber = input.nextInt();

        System.out.println("Até o número: ");
        lastNumber = input.nextInt();

        System.out.println("Números primos de " + firstNumber + " até " + lastNumber);
        System.out.println("2");

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i == 2) {
                System.out.println("2");
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                    if (j == (i - 1)){
                        System.out.println(i);
                    }
                }
            }
        }
        input.close();
    }
}