package aula_2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        StringBuilder reverse = new StringBuilder(); //Stringbuilder permite que a String receba dados de qualquer tipo ( char, int , etc )

        System.out.println("Digite o seu nome");
        name = input.nextLine();

        for(int i= name.length() - 1; i >= 0; i--){
            char letter = name.charAt(i);
            reverse.append(letter); //Usa-se o append para adicionar o conteúdo da variável na string.
        }

        System.out.println("O seu nome ao contrário é: " + reverse);
        input.close();
    }
}
