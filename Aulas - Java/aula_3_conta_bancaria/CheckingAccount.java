package aula_3_conta_bancaria;

public class CheckingAccount extends BankAccount implements Tributavel {

    public CheckingAccount(String name, String cpf) {
        super(name, cpf);
    }

    public double calculateTribute(boolean active){
        if(active) {
            return (super.getBalance() * 0.01);
        }else{
            return 0;
        }
    }
}
