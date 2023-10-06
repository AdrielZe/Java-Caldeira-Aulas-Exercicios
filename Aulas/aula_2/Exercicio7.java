package aula_2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long guessing;

        System.out.println("Quantos inimigos iremos combater?");

        do {
            guessing = input.nextInt();
            if(guessing < 300000){
                System.out.println("Um pouco mais!!");
            } else if (guessing > 300000){
                System.out.println("Um pouco menos !!!");
            } else {
                System.out.println("Acertou!");
            }
        }while(guessing != 300000);

    }
}
