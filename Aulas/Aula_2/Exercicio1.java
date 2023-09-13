package Aula_2;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,finalNumber;

        System.out.println("Você quer gerar números primos começando do número: ");
        number = input.nextInt();

        System.out.println("Até o número: ");
        finalNumber = input.nextInt();

        System.out.println("Números primos de " + number + " até " + finalNumber + " : ");

        for (int i = number; i < finalNumber; i++){ //Primeiro for , gera todos os números entre number e finalNumber (inputs do usuário)
            if(i == 2){ //O 2 é primo, mas não é possível colocà-lo no segundo for pois o loop não será executado caso J seja igual a I, e J sempre começa no número 2.
                System.out.println("2"); //Portanto, deixamos como padrão que seja printado "2" na tela, quando i = 2;
            } else {
                for(int j = 2; j < i; j++){ // Executa todas as divisões entre 2 e number, e verifica se em alguma delas o resto da divisão é 0.
                    if(i % j == 0){ //Se for, já sabemos que esse número não é um número primo, então utilizamos o break para sair do for loop e ir para o próximo número.
                        break;
                    }
                    if(j == (i - 1)){//Se nenhuma das divisões ter o resto 0 ,printamos o número, pois significa que ele é um primo.
                        System.out.println(i);
                    }
                }
            }
        }
        input.close();
    }
}