package aula_7;

import java.util.Scanner;

public class Exercicio5Main{
    public static void main(String[] args) {
        Exercicio5Idade verificaIdade = new Exercicio5Idade();
        Scanner input = new Scanner(System.in);
        int idade;
        boolean running = true;
        do {
            try {
                System.out.println("Digite a sua idade: ");
                idade = input.nextInt();
                verificaIdade.verificaIdade(idade);
                running = false;
            } catch (Exception Exercicio5IdadeInvalidaException) {
                System.out.println("Digite uma idade que seja maior que 0 e menor que 150");
                input.nextLine();
            }
        }while (running);
    }
}
