
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        age = input.nextInt();

        if(age < 16){
            System.out.println("Você não pode votar.");
        } else if (age == 16 || age == 17 || age > 65) {
            System.out.println("O seu voto é facultativo.");
        } else if (age >= 18 || age <= 65) {
            System.out.println("O seu voto é obrigatório.");
        }
    }
}
