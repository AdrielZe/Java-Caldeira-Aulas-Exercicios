package aula_7;

import java.util.Scanner;

public class Exercicio3_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInt = false;
        int n1, n2;

        do {
            try {
                System.out.println("Digite um número inteiro: ");
                n1 = input.nextInt();
            } catch (Exception ex) {
                System.out.println("Digite um número inteiro!");
            }
        }while(isInt);

    }
        }

