package aula_3_conta_bancaria;

import java.util.Random;
import java.time.LocalDateTime;

public abstract class BankAccount {
    public LocalDateTime currentTime = LocalDateTime.now();
    Validator valida = new Validator();
    Random randomId = new Random();
    private boolean active = false;
    private String name;
    private String cpf;
    private int accountId;
    private String bankName = "AdrBank";
    private String address = "Casa " + " " + Integer.toString(houseNumber);
    private double balance = 0;
    static int houseNumber = 1;
    String activityHistory = "";




    public BankAccount(String name, String cpf) {
        if(valida.validaCpf(cpf)) {
            System.out.println("Conta criada com sucesso!");
            this.name = name;
            this.cpf = cpf;
            this.accountId = - (randomId.nextInt());
            if(this.accountId < 0){
                this.accountId = - (this.accountId);
            }
            this.active = true;
            houseNumber++;
        } else{
            System.out.println("Erro ao criar conta, CPF inválido.");
        }
    }


    public void withdraw(double value) {
        if(active) {
            if (this.balance >= value) {
                this.balance -= value;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Valor total restante na conta: " + this.balance);
                addToHistory("Saque", value, currentTime);
            } else {
                System.out.println("Erro! Saldo insuficiente.");

            }
        } else {
            System.out.println("Erro. Conta inativa!");
        }
    }

    public void deposit(double value) {
        if(active) {
            this.balance += value;
            addToHistory("Depósito", value, currentTime);
        }
        else {
            System.out.println("Erro. Conta inativa!");
        }
    }

    public void pixTransference(double value, BankAccount account) {
        if(active) {
            if (this.balance >= value) {
                this.balance -= value;
                account.balance += value;
                System.out.println("Transferência PIX realizada com sucesso!");
                addToHistory("Transferência PIX", value, currentTime);
            } else {
                System.out.println("Erro ! Saldo insuficiente.");
            }
        }
        else {
            System.out.println("Erro. Conta inativa!");
        }
    }

    public void transference(double value, BankAccount account) {
        if(active) {
            if (this.balance >= value && (currentTime.getHour() > 8 && currentTime.getHour() < 19)) {
                this.balance -= value;
                account.balance += value;
                System.out.println("Transferência realizada com sucesso!");
                addToHistory("Transferência comum", value, currentTime);
            } else {
                System.out.println("Erro ! Saldo insuficiente ou fora do horário de transição.");
            }
        }
        else {
            System.out.println("Erro. Conta inativa!");
        }
    }

    public void addToHistory(String activity, double value, LocalDateTime currentTime){
        activityHistory += ("\nOperação: " + activity + " - Valor: R$" + value + " - Horário: " + currentTime);
    }

    public void closeAccount(){
        this.active = false;
        this.balance = 0;
    }

    public void setBankName(String name){
        name = this.bankName;
    }
    public String getBankName(){
        return this.bankName;
    }
    public boolean getActive(){
        return this.active;
    }
    public String getActivityHistory(){
        return this.activityHistory;
    }

    public double getBalance() {
        return this.balance;
    }

    public LocalDateTime getCurrentTime() {
        return this.currentTime;
    }

    public void viewBankAccountInfo() {
        if (active) {
            System.out.println("---------------------------");
            System.out.println("Informações da conta: ");
            System.out.println("Nome : " + this.name);
            System.out.println("CPF : " + this.cpf);
            System.out.println("ID da conta : " + this.accountId);
            System.out.println("Banco : " + this.bankName);
            System.out.println("Endereço : " + this.address);
            System.out.println("Saldo : R$" + this.balance);
            System.out.println("Horário atual : " + this.currentTime);
            System.out.println("---------------------------\n");
        }else {
            System.out.println("Erro. Conta não ativa.");
        }
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public void setBalance(double balance){
        this.balance += balance;
    }
}

