package aula_3_conta_bancaria;

public class SavingsAccount extends BankAccount implements Tributavel {

    public SavingsAccount(String name, String cpf) {
        super(name, cpf);
    }

    public double calculateTribute(boolean active){
        return 0;
    }
}
