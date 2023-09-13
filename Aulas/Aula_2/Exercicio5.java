package Aula_2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        StringBuilder half = new StringBuilder(); //Stringbuilder permite que a String receba dados de qualquer tipo ( char, int , etc )

        System.out.println("Digite o seu nome");
        name = input.nextLine();

        for(int i=0; i < (name.length()/2); i++){
            char letter = name.charAt(i);
            half.append(letter); //Usa-se o append para adicionar o conteúdo da variável na string.
        }

        System.out.println("A metade do seu nome é: " + half);
        input.close();
    }
}
