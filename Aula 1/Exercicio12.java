import java.util.Scanner;

public class Exercicio12 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double dolar;
        double reais;

        System.out.println("Digite a quantia em dolar a ser convertida em reais");
        dolar = input.nextDouble();
        reais = dolar * 5;

        System.out.println("Você possui " + reais + " reais.");
    }
}
