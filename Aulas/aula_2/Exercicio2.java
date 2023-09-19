package Aula_2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String leave;
        int n1,n2;

        do{
            System.out.println("Digite um número: ");
            n1 = input.nextInt();

            System.out.println("Digite outro número: ");
            n2 = input.nextInt();

            System.out.println("Qual operação você deseja realizar?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            option = input.nextInt();

            switch (option){
                case 1 -> System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                case 2 -> System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                case 3 -> System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
                case 4 -> System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
                default -> System.out.println("Opção inválida");
            }

            System.out.println("Deseja continuar realizando cálculos?");
            System.out.println("s/n:");
            leave = input.nextLine();
            leave = input.nextLine();

        } while (!leave.equals("n") && !leave.equals("N") );

        System.out.println("Encerrando programa...");
        input.close();
    }
}
