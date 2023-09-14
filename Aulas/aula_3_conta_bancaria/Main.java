package aula_3_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        BankAccount contaDoAdriel = new BankAccount("Adriel",1500);
        BankAccount outraConta = new BankAccount("Rodrigo",500);

        contaDoAdriel.transference(2000,outraConta);
        System.out.println(contaDoAdriel.getBalance());
        System.out.println(outraConta.getBalance());

        System.out.println(contaDoAdriel.currentTime.getHour());
    }
}
