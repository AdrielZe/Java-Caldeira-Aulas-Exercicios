
import java.util.Scanner;

public class Exercicio4 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o total de seu salário atual mensal: ");
        double userSalary = input.nextDouble();

        System.out.println("O seu salário equivale à " + userSalary/1320 + " salários mínimos");
    }
}
