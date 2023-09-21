package aula_5;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println("Insira um número para verificar se ele est;a ");
    }
}
