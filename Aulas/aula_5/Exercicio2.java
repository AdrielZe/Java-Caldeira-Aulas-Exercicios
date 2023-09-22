package aula_5;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Exercicio2_verificador verificador = new Exercicio2_verificador();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];

        for(int i = 0; i < 10; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println("Insira um número para verificar se ele está presente no array: ");
        int n = input.nextInt();

        verificador.verificaSePresente(array,n);
    }
}
