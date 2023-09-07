import java.util.Scanner;

public class Exercicio11 {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        String word;
        int vowelCounter = 0;

        System.out.println("Digite uma palavra para serem contadas as vogais: ");
        word = input.nextLine();

        for(int i=0; i < word.length(); i++){
            char currentLetter;
            currentLetter = word.charAt(i);
            switch (currentLetter){
                case 'a','e','i','o','u','A','E','I','O','U' -> vowelCounter++;
            }
        }

        System.out.println("A palavra digitada possui " + vowelCounter + " vogais");

    }
}
