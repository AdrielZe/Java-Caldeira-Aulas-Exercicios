package aula_3_conta_bancaria;

public class LifeInsurance implements Tributavel{
    public double calculateTribute(boolean active){
        if (active) {
            return 42;
        }else{
            return 0;
        }
    }
}
