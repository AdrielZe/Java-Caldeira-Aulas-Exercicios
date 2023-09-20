package aula_3_conta_bancaria;

public class Main {
    public static void main(String[] args) {
          CheckingAccount contaDoAdriel = new CheckingAccount("Adriel","85916510063");
          LifeInsurance seguroDoAdriel = new LifeInsurance();
          GerenciadorDeImpostoDeRenda gerenciadorDoAdriel = new GerenciadorDeImpostoDeRenda();

          contaDoAdriel.deposit(1000);

          gerenciadorDoAdriel.adicionar(seguroDoAdriel.calculateTribute(contaDoAdriel.getActive()));
          gerenciadorDoAdriel.adicionar(contaDoAdriel.calculateTribute(contaDoAdriel.getActive()));

          System.out.println(gerenciadorDoAdriel.getTaxesSum());

    }
 }
