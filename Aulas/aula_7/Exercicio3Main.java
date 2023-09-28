package aula_7;

import java.util.Scanner;

public class Exercicio3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop= true;
        int n1 = 0, n2 = 0;
        String operation;

        do {
            try {
                System.out.println("1- Digite um número inteiro: ");
                n1 = input.nextInt();

                System.out.println("2- Digite outro número inteiro: ");
                n2 = input.nextInt();

                System.out.println("3- Qual operação você deseja realizar?(Soma, Subtracao, Multiplicacao ou Divisao?");
                operation= input.nextLine().toUpperCase();
                operation= input.nextLine().toUpperCase();

                System.out.println("O  resultado da " + operation + " é: " + exercicio4Enum.realizaOperacao(exercicio4Enum.valueOf(operation),n1,n2));

                loop = false;
            } catch (Exception ex) {
                System.out.println("Erro. Tente novamente");
                input.nextLine();
            }
        } while (loop);

    }
}

