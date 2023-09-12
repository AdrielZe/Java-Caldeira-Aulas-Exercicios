package Aula_1;

import java.util.Scanner;

public class Exercicio7 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        double salary;

        System.out.println("Digite a sua idade: ");
        age = input.nextInt();

        System.out.println("Digite o seu salário: ");
        salary = input.nextDouble();

        if(age >= 18 && salary > 2000){
            System.out.println("Parabéns! Você pode comprar um automóvel!");
        } else{
            System.out.println("Lamentamos, mas você não atende os requisitos necessários para a realizar a compra de um automóvel");
        }

        input.close();
    }

}
