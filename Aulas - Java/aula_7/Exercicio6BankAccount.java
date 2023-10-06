package aula_7;

public class Exercicio6BankAccount {
    private double balance = 300;

    public void sacar(double valor) throws Exercicio6SaldoInsuficienteException {
        if(this.balance - valor < 0){
            throw new Exercicio6SaldoInsuficienteException("Saldo insuficiente!!!!!");
        }else{
            this.balance -= valor;
            System.out.println("Saque feito com sucesso.");
        }

    }

    public double getBalance() {
        return this.balance;
    }
}
