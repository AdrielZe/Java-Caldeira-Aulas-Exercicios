package aula_3_conta_bancaria;

public class GerenciadorDeImpostoDeRenda {
    private double taxesSum = 0;

    public void adicionar(double tax){
        this.taxesSum += tax;
    }

    public double getTaxesSum(){
        return  this.taxesSum;
    }

}
