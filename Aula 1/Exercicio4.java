
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio4 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double numberOfMinimunSalaries;

        System.out.println("Digite o total de seu salário atual mensal: ");
        double userSalary = input.nextDouble();

        numberOfMinimunSalaries = userSalary/1320;
        String roundedValue = new DecimalFormat("#.##").format(numberOfMinimunSalaries);
        System.out.println("O seu salário equivale à " + roundedValue + " salários mínimos");
    }
}
