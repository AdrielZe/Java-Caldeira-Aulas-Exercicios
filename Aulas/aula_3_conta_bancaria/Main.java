package aula_3_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        TaxaMensalidade taxa = new TaxaMensalidade();

       BankAccount contaDoAdriel = new BankAccount("Adriel","85916510063");
       BankAccount contaDoJoao = new BankAccount("João","92571433091");

        contaDoAdriel.deposit(4000);
        contaDoAdriel.withdraw(2000);
        contaDoAdriel.transference(1000,contaDoJoao);
        System.out.println(contaDoAdriel.getBalance());

        contaDoAdriel.closeAccount();

        contaDoAdriel.deposit(4000);
        contaDoAdriel.withdraw(2000);
        contaDoAdriel.transference(1000,contaDoJoao);
        System.out.println(contaDoAdriel.getBalance());

    }
 }
