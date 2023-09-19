package aula_1;

import java.util.Scanner;

public class Exercicio9 {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        int age;
        System.out.println("Digite o seu ano de nascimento: ");
        age = 2023 - input.nextInt();
        System.out.println("Você tem " + age + " anos");

        input.close();

    }
}
