package aula_3_conta_bancaria;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class BankAccount {
    public LocalDateTime currentTime = LocalDateTime.now();
    private String name;
    private long cpf;
    private int accountId;
    private String bankName;
    private String address;
    private double balance;


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor total restante na conta: " + this.balance);
        } else {
            System.out.println("Erro! Saldo insuficiente.");
        }
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void pixTransference(double value, BankAccount account) {
        if (this.balance >= value) {
            this.balance -= value;
            account.balance += value;
            System.out.println("Transferência realizada com sucesso!");
        } else {
                System.out.println("Erro ! Saldo insuficiente.");
        }
    }

    public void transference(double value, BankAccount account) {
        if (this.balance >= value && (currentTime.getHour() > 8 && currentTime.getHour() < 15)) {
            this.balance -= value;
            account.balance += value;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Erro ! Saldo insuficiente ou fora do horário de transição.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public LocalDateTime getCurrentTime() {
        return this.currentTime;
    }

    public void viewBankAccountInfo() {
        System.out.println("Account information: ");
        System.out.println("Name : " + this.name);
        System.out.println("CPF : " + this.cpf);
        System.out.println("Account ID : " + this.accountId);
        System.out.println("Bank : " + this.bankName);
        System.out.println("Address : " + this.address);
        System.out.println("Balance : " + this.balance);
        System.out.println("Current time : " + this.currentTime);
    }
}
