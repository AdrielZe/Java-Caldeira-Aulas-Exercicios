package Aula_1;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("---Filas prioritárias---");
        System.out.println("---Você é:--- ");
        System.out.println("1 - Gestante");
        System.out.println("2 - Idoso");
        System.out.println("3 - Deficiente");
        System.out.println("4 - Nenhuma das alternativas");
        option = input.nextInt();

        switch (option) {
            case 1,2,3 -> System.out.println("Você tem direito à fila prioritária.");
            case 4 -> System.out.println("Você não tem direito à fila prioritária.");
            default -> System.out.println("Opção inválida");
        }

        input.close();

    }
}
