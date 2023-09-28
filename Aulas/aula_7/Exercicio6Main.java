package aula_7;

public class Exercicio6Main {
    public static void main(String[] args) {
        Exercicio6BankAccount contaDoAdriel = new Exercicio6BankAccount();
        try {
            contaDoAdriel.sacar(400);
        } catch (Exercicio6SaldoInsuficienteException Ex){
            System.out.println(Ex.getMessage());
        }
    }
}
