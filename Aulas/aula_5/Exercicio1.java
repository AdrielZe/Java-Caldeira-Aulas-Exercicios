package aula_5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] n = new int[5];

        for (int i = 0; i < n.length ; i++){
           if( i == 0) {
               System.out.println("Digite um número: ");
           } else{
               System.out.println("Digite outro número: ");
           }
            n[i] = input.nextInt();
            sum += n[i];
        }

        System.out.println("A soma de todos os números digitados é de: " + sum);
        System.out.println("A média de todos os números digitados é de: " + sum/n.length);

    }
}
