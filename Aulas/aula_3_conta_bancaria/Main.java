package aula_3_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        MonthlyTax taxa = new MonthlyTax();

       BankAccount contaDoAdriel = new BankAccount("Adriel","85916510063");
       BankAccount contaDoJoao = new BankAccount("João","92571433091");


       contaDoAdriel.deposit(10);
       contaDoAdriel.pixTransference(5,contaDoJoao);
       contaDoJoao.setAddress("Rua do DC shopping");
       contaDoAdriel.setAddress("Rua do Caldeira");
       contaDoAdriel.viewBankAccountInfo();
       contaDoJoao.viewBankAccountInfo();
       contaDoAdriel.closeAccount();
       contaDoAdriel.deposit(30);
    }
 }
