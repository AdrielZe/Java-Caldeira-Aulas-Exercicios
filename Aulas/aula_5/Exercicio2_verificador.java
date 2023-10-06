package aula_5;

public class Exercicio2_verificador {

    public void verificaSePresente(int[] array, int number){
        for ( int i : array){
            if(number == i ){
                System.out.println("Presente no array");
                return;
            }
        }
        System.out.println("Não está no array");
    }
}
