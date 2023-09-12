package Aula_1;

import java.util.Scanner;

public class Exercicio10 {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        double celsius,fahrenheit;

        System.out.println("Digite uma temperatura em graus Celsius para ser convertida em Fahrenheit");
        fahrenheit = (input.nextDouble() * 9/5) + 32;

        System.out.println(fahrenheit + " Fahrenheit");

        input.close();

    }
}
